package com.gedehua.service;

import com.gedehua.domain.ResponseResult;
import com.gedehua.domain.User;

public interface LoginService {
    ResponseResult login(User user);
}
