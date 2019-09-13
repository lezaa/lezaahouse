package com.keepzzz.film.service;

import com.keepzzz.film.domain.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAllFilms();

    boolean addFilm(Film film);

    Film getFilmInfo(long FilmId);

    List<Film> stateFilm(long state);

}
