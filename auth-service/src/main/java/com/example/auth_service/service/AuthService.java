package com.example.auth_service.service;

import com.example.auth_service.dto.JwtResponseDto;
import com.example.auth_service.dto.LoginDto;
import com.example.auth_service.dto.RegisterDto;

public interface AuthService {

    String register(RegisterDto registerDto);

    JwtResponseDto login(LoginDto loginDto);
}
