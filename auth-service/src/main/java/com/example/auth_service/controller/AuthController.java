package com.example.auth_service.controller;

import com.example.auth_service.dto.JwtResponseDto;
import com.example.auth_service.dto.LoginDto;
import com.example.auth_service.dto.RegisterDto;
import com.example.auth_service.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @RequestBody RegisterDto registerDto){

        return ResponseEntity.ok(
                authService.register(registerDto)
        );
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponseDto> login(
            @RequestBody LoginDto loginDto){

        return ResponseEntity.ok(
                authService.login(loginDto)
        );
    }
}