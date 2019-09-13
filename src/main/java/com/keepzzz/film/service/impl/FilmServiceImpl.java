package com.keepzzz.film.service.impl;

import com.keepzzz.film.domain.Film;
import com.keepzzz.film.mapper.FilmMapper;
import com.keepzzz.film.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public List<Film> getAllFilms() {
        return filmMapper.getAll();
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
