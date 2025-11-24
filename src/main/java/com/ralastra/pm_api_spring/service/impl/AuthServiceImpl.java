package com.ralastra.pm_api_spring.service.impl;

import com.ralastra.pm_api_spring.dto.LoginRequest;
import com.ralastra.pm_api_spring.dto.LoginResponse;
import com.ralastra.pm_api_spring.model.User;
import com.ralastra.pm_api_spring.repository.UserRepository;
import com.ralastra.pm_api_spring.service.AuthService;
import com.ralastra.pm_api_spring.util.JwtUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    
    public AuthServiceImpl(UserRepository userRepository, 
                          PasswordEncoder passwordEncoder,
                          JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }
    
    @Override
    public LoginResponse login(LoginRequest request) {
        // Find user by email
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));
        
        // Verify password
        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid email or password");
        }
        
        // Generate JWT token
        String token = jwtUtil.generateToken(user.getId(), user.getEmail());
        
        // Return login response
        return new LoginResponse(
                token,
                user.getId(),
                user.getEmail(),
                user.getFullName()
        );
    }
}
