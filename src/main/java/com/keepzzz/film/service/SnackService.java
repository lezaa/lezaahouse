package com.keepzzz.film.service;

import com.keepzzz.film.domain.Snack;

import java.util.List;

public interface SnackService {


    List<Snack> getSnacks();


    Snack getSnack(Long id);


    boolean insert(Snack snack);

    boolean update(Snack snack);
}
