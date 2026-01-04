package com.example.empSystem.controller;

import com.example.empSystem.controller.dto.LoginRequest;
import com.example.empSystem.controller.dto.SignupRequest;
import com.example.empSystem.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@Valid @RequestBody SignupRequest request) {
        authService.signup(request.getUsername(), request.getPassword());
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody LoginRequest request) {
        authService.login(request.getUsername(), request.getPassword());
        return ResponseEntity.ok("Login successful");
    }
}
