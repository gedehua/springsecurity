package com.gedehua;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.gedehua.Mapper.UserMapper;
import com.gedehua.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Base64;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class Test {
    @Autowired
    UserMapper userMapper;
    @org.junit.jupiter.api.Test
    void get(){
        System.out.println(userMapper.selectAllByUsername("gedehua"));
    }
}
