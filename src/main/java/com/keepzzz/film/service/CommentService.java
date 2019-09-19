package com.keepzzz.film.service;

import com.keepzzz.film.domain.Comment;

import java.util.List;

public interface CommentService {


    boolean publishComment(Comment comment);

    List<Comment> filmComments(long filmId);

    List<Comment> userComments(long userId);

    boolean deleteComments(long id);
}
