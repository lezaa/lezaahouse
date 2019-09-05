package com.keepzzz.film.mapper;

import com.keepzzz.film.domain.Film;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FilmMapper {

    @Select("select * from film")
    List<Film> getAll();

}
