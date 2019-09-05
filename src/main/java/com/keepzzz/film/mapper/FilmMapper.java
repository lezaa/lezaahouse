package com.keepzzz.film.mapper;

import com.keepzzz.film.domain.Film;
import com.keepzzz.film.provider.FilmProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface FilmMapper {


    @Select("select * from film")
    List<Film> getAll();


    /**
     * 更新电影
     * @param film
     * @return
     */
    @UpdateProvider(type = FilmProvider.class ,method = "updateFilm")
    int update(Film film);


    /**
     * 新增电影
     * @param film
     * @return
     */
    @InsertProvider(type = FilmProvider.class,method = "insertFilm")
    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    int insert(Film film);


    /**
     * 删除电影
     * @param id
     * @return
     */
    @Delete("delete from film where id = #{id}")
    int delete(long id);


}
