package com.gedehua.controller;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @RequestMapping("/hello")
    @PreAuthorize("hasAuthority('test1')")
    public String hello(){
        return "hello";
    }
}
