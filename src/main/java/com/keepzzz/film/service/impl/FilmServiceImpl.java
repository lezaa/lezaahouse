package com.keepzzz.film.service.impl;

import com.keepzzz.film.domain.Film;
import com.keepzzz.film.mapper.FilmMapper;
import com.keepzzz.film.service.FilmService;
import com.keepzzz.film.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private static final Logger log = LoggerFactory.getLogger(FilmServiceImpl.class);

    private static final String ALL_FILMS = "allfilms";

    @Autowired
    private FilmMapper filmMapper;

    @Autowired
    private RedisService redisService;



    @Override
    public List<Film> getAllFilms() {
        List<Film> films = (List<Film>) redisService.get(ALL_FILMS);
        if(films != null)
        {
            log.info("从缓存中获取数据");
            return films;
        }else {
            List<Film> DBfilms = filmMapper.getAll();
            redisService.set(ALL_FILMS,DBfilms);
            log.info("从数据库获取数据");
            return DBfilms;
        }

    }

    @Override
    public boolean addFilm(Film film) {

     return filmMapper.insert(film) > 0;

    }

    @Override
    public Film getFilmInfo(long filmId) {
      return filmMapper.getFilmById(filmId);
    }

    @Override
    public List<Film> stateFilm(long state) {
        return filmMapper.getFilmsByState(state);
    }


}
