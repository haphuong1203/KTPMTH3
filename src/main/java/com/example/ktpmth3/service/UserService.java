package com.example.ktpmth3.service;

import com.example.ktpmth3.authen.UserPrincipal;
import com.example.ktpmth3.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}


