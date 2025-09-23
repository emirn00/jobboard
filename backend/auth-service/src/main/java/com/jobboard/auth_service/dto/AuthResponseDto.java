package com.jobboard.auth_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthResponseDto {
    private String token;

    public AuthResponseDto() {}

    public AuthResponseDto(String token) {
        this.token = token;
    }

    // getter & setter
}
