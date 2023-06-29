package com.springboot.blog.springbootblogrestapi.service;

import com.springboot.blog.springbootblogrestapi.payload.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
