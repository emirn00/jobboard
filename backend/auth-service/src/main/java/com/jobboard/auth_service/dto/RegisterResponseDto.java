package com.jobboard.auth_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RegisterResponseDto {
    private String message;

    public RegisterResponseDto(String message) {
        this.message = message;
    }

}
