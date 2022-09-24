package com.example.ktpmth3.service;

import com.example.ktpmth3.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
