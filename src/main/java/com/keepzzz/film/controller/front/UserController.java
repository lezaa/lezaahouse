package com.keepzzz.film.controller.front;

import com.keepzzz.film.base.ApiResponse;
import com.keepzzz.film.enums.Status;
import com.keepzzz.film.service.UserService;
import com.keepzzz.film.vo.LoginVO;
import com.keepzzz.film.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
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
    @PostMapping("/login")
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


    /**
     * 用户注册接口
     * @param registerVO
     * @param bindingResult
     * @return
     */
    @PostMapping("/register")
    public ApiResponse register(@Validated RegisterVO registerVO,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ApiResponse.ofStatus(Status.NOT_VALID_PARAM);
        }
        boolean flag = userService.register(registerVO);
        if(flag){
            return ApiResponse.ofSuccess();
        }
        return ApiResponse.ofStatus(Status.Not_SUPPORTED_OPERATION);
    }

    @PostMapping("/")
    public ApiResponse updateUserInfo(){
        return null;
    }
}