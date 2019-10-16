package com.keepzzz.film.mapper;

import com.keepzzz.film.domain.Comment;
import com.keepzzz.film.provider.CommentProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Size;
import java.util.List;

@Repository
public interface CommentMapper {


    /**
     *
     * 查询所有评论
     * @return
     */
    @Select("select * from comment")
    List<Comment> getComments();


    /**
     * 根据id查询评论
     * @return
     */
    @Select("select * from comment where id = #{id}")
    List<Comment> getComment(long id);

    /**
     * 查询电影评论
     * @param filmId
     * @return
     */
    @Select("select * from comment where film_id = #{filmId}")
    List<Comment> getFilmComments(long filmId);


    /**
     * 查询用户评论
     * @param userId
     * @return
     */
    @Select("select * from comment where user_id = #{usrId}")
    List<Comment> getUserComments(long userId);

    /**
     * 添加评论
     * @param comment
     * @return
     */
    @InsertProvider(type = CommentProvider.class,method = "insertComment")
    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    int insert(Comment comment);


    /**
     * 更新评论
     */
    @UpdateProvider(type = CommentProvider.class,method = "updateComment")
    int update(Comment comment);


    /**
     * 删除评论
     * @param id
     * @return
     */
    @Delete("delete from comment where id = #{id}")
    int delete(long id);


    /**
     * 批量删除
     * @param ids
     * @return
     */
    @DeleteProvider(type = CommentProvider.class,method = "batchDelete")
    int deleteBatch(List<Long> ids);

}
