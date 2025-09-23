package com.jobboard.auth_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RegisterRequestDto {

    private String username;
    private String email;
    private String password;
    private String role;

    public RegisterRequestDto() {}

    public RegisterRequestDto(String username, String email, String password, String role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // getters & setters
}
