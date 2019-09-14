package com.keepzzz.film.controller.front;

import com.keepzzz.film.base.ApiResponse;
import com.keepzzz.film.enums.Status;
import com.keepzzz.film.service.UserService;
import com.keepzzz.film.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 按照账号密码登陆
     * @param loginVO
     * @param bindingResult
     * @return
     */
    @RequestMapping("/login")
    public ApiResponse login(@Validated LoginVO loginVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ApiResponse.ofStatus(Status.NOT_VALID_PARAM);
        }
        boolean flag = userService.login(loginVO.getUsername(), loginVO.getPassword());
        if(flag){
            return ApiResponse.ofSuccess();
        }
        return  ApiResponse.ofStatus(Status.ACCOUNT_ERROR);
    }
}
