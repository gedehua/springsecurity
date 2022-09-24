package com.gedehua.service.impl;

import com.gedehua.Mapper.UserMapper;
import com.gedehua.domain.LoginUser;
import com.gedehua.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.selectAllByUsername(username);

        if(Objects.isNull(user)){
            throw new RuntimeException("用户名密码错误");
        }

        return new LoginUser(user,List.of(user.getAuthorities()));
    }
}
