package com.keepzzz.film.service;

import com.keepzzz.film.domain.Comment;
import com.keepzzz.film.vo.CommentVO;

import java.util.List;

public interface CommentService {


    boolean publishComment(CommentVO commentVO);

    List<Comment> filmComments(long filmId);

    List<Comment> userComments(long userId);

    boolean deleteComments(long id);
}
