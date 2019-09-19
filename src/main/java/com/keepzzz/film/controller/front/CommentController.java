package com.keepzzz.film.controller.front;

import com.keepzzz.film.base.ApiResponse;
import com.keepzzz.film.domain.Comment;
import com.keepzzz.film.enums.Status;
import com.keepzzz.film.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 电影评论接口
 */
@RestController
@RequestMapping("/api/v1/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;


    /**
     * 发布评论
     * @param comment
     * @return
     */
    @PostMapping("/publish")
    public ApiResponse pubComment(@RequestBody Comment comment){
        boolean flag =commentService.publishComment(comment);
        if(flag){
            return ApiResponse.ofSuccess();
        }
        return ApiResponse.ofStatus(Status.NOT_VALID_PARAM);
    }

}
