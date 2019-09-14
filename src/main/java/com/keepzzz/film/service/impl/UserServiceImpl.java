package com.keepzzz.film.service.impl;

import com.keepzzz.film.domain.User;
import com.keepzzz.film.mapper.UserMapper;
import com.keepzzz.film.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(String username,String password) {

        //todo 密码加密
        User user = userMapper.getUserByUsername(username);
        if(user != null){
                if(password.equals(user.getPassword())){
                    return true;
                }else {
                    return false;
                }
        }
        return false;
    }

    @Override
    public boolean register(User user) {
        return false;
    }
}
