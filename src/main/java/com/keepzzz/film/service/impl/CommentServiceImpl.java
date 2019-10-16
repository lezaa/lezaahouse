package com.keepzzz.film.service.impl;

import com.keepzzz.film.domain.Comment;
import com.keepzzz.film.mapper.CommentMapper;
import com.keepzzz.film.service.CommentService;
import com.keepzzz.film.vo.CommentVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;


    @Override
    public boolean publishComment(CommentVO commentVO) {
        Comment comment = new Comment();
        comment.setCreateTime(new Date());
        BeanUtils.copyProperties(commentVO,comment);
        return commentMapper.insert(comment) > 0;
    }

    @Override
    public List<Comment> filmComments(long filmId) {
        List<Comment> comments = commentMapper.getFilmComments(filmId);
        return comments;
    }

    @Override
    public List<Comment> userComments(long userId) {
        List<Comment> userComments = commentMapper.getUserComments(userId);
        return userComments;
    }


    @Override
    public boolean deleteBatch(Long[] ids) {
        List<Long> fids = new ArrayList<>(Arrays.asList(ids));
        return commentMapper.deleteBatch(fids) > 0 ;
    }
}
