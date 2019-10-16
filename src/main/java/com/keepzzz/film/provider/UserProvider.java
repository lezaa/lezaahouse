package com.keepzzz.film.provider;

import com.keepzzz.film.domain.User;
import org.apache.ibatis.jdbc.SQL;

public class UserProvider {

    public String addUser(final User user){
        return new SQL(){{
            INSERT_INTO("user");
            if(user.getIdCard() != null){
                VALUES("id_card","#{idCard}");
            }
            if(user.getUsername() != null){
                VALUES("username","#{username}");
            }
            if(user.getPassword() != null){
                VALUES("password","#{password}");
            }
            if(user.getPhone() != null){
                VALUES("phone","#{phone}");
            }
            if(user.getUserPhoto() != null){
                VALUES("user_photo","#{userPhoto}");
            }
            if(user.getRealName() != null){
                VALUES("real_name","#{realName}");
            }
            if(user.getSex() != null){
                VALUES("sex","#{sex}");
            }
            if(user.getRole() != null){
                VALUES("role","#{role}");
            }
        }}.toString();
    }
}
