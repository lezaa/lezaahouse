package com.keepzzz.film.mapper;

import com.keepzzz.film.domain.Comment;
import com.keepzzz.film.provider.CommentProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.stereotype.Repository;

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
    Comment getComment(long id);

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

}
