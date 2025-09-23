package com.jobboard.auth_service.controller;

import com.jobboard.auth_service.dto.AuthResponseDto;
import com.jobboard.auth_service.dto.LoginRequestDto;
import com.jobboard.auth_service.dto.RegisterRequestDto;
import com.jobboard.auth_service.dto.RegisterResponseDto;
import com.jobboard.auth_service.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDto> register(@RequestBody RegisterRequestDto request) {
        authService.register(request);
        return ResponseEntity.ok(new RegisterResponseDto("User registered successfully"));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginRequestDto request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/hello-secure")
    public String helloSecure() {
        return "Hello, authenticated user!";
    }
}
