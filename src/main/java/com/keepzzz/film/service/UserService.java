package com.keepzzz.film.service;

import com.keepzzz.film.vo.RegisterVO;

public interface UserService {

    boolean login(String username,String password);


    boolean register(RegisterVO registerVO);


    //boolean updateInfo(User user);
}
