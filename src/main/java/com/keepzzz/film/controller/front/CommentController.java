package com.keepzzz.film.controller.front;

import com.keepzzz.film.base.ApiResponse;
import com.keepzzz.film.domain.Comment;
import com.keepzzz.film.enums.Status;
import com.keepzzz.film.service.CommentService;
import com.keepzzz.film.vo.CommentVO;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     * @param commentVO
     * @return
     */
    @PostMapping("/publish")
    public ApiResponse pubComment(@RequestBody @Validated CommentVO commentVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ApiResponse.ofStatus(Status.NOT_VALID_PARAM);
        }
        boolean flag =commentService.publishComment(commentVO);
        if(flag){
            return ApiResponse.ofSuccess();
        }
        return ApiResponse.ofStatus(Status.BAD_REQUEST);
    }


    /**
     * 获取电影详情下的评论列表
     * @param filmId
     * @return
     */
    @GetMapping("/info/{filmId}")
    public ApiResponse filmComments(@PathVariable("filmId") long filmId){
        List<Comment> comments = commentService.filmComments(filmId);
        if(comments != null){
            return ApiResponse.ofSuccess(comments);
        }
        return ApiResponse.ofStatus(Status.BAD_REQUEST);
    }


    /**
     * 获取用户的评论
     * @param userId
     * @return
     */
    @GetMapping("/user/{userId}")
    public ApiResponse userComments(@PathVariable("userId") long userId){
        List<Comment> comments = commentService.userComments(userId);
        if(comments != null){
            return ApiResponse.ofSuccess(comments);
        }
        return ApiResponse.ofStatus(Status.BAD_REQUEST);
    }



    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteMapping("/{id}")
    public ApiResponse deleteComments(@PathVariable("id") Long[] ids){
        boolean flag = commentService.deleteBatch(ids);
        if(flag){
            return ApiResponse.ofSuccess();
        }
        return ApiResponse.ofStatus(Status.BAD_REQUEST);
    }


}
