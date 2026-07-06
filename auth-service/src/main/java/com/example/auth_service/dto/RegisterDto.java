package com.example.auth_service.dto;

import lombok.Data;

@Data
public class RegisterDto {
    private String name;
    private String email;
    private String password;
}
