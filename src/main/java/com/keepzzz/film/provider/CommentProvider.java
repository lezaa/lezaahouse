package com.keepzzz.film.provider;

import com.keepzzz.film.domain.Comment;
import org.apache.ibatis.jdbc.SQL;

public class CommentProvider {
    public String insertComment(final Comment comment) {
        return new SQL() {{
            INSERT_INTO("comment");
            if (comment.getUserId() != null) {
                VALUES("user_id", "#{userId}");
            }
            if (comment.getFilmId() != null) {
                VALUES("film_id", "#{filmId}");
            }
            if (comment.getCreateTime() != null) {
                VALUES("create_time", "#{createTime}");
            }
            if (comment.getComments() != null) {
                VALUES("comments", "#{comments}");
            }

        }}.toString();
    }


    public String updateComment(final Comment comment) {
        return new SQL() {{
            UPDATE("comment");
            if (comment.getUserId() != null) {
                SET("user_id", "#{userId}");
            }
            if (comment.getFilmId() != null) {
                SET("film_id", "#{filmId}");
            }
            if (comment.getCreateTime() != null) {
                SET("create_time", "#{createTime}");
            }
            if (comment.getComments() != null) {
                SET("comments", "#{comments}");
            }
            WHERE("id = #{id}");
        }}.toString();

    }
}
