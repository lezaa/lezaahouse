package com.keepzzz.film.service;

import com.keepzzz.film.domain.User;

public interface UserService {

    boolean login(String username,String password);


    boolean register(User user);
}
