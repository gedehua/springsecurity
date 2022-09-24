package com.gedehua.controller;


import com.gedehua.domain.ResponseResult;
import com.gedehua.domain.User;
import com.gedehua.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        log.info("user:" +user);
        return loginService.login(user);
    }
}
