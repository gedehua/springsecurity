package com.gedehua.service.impl;

import com.gedehua.Mapper.UserMapper;
import com.gedehua.domain.User;
import com.gedehua.service.GetUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetUserImpl implements GetUser {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(long id) {
        return userMapper.selectAllById(id);
    }
}
