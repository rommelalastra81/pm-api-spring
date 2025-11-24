package com.ralastra.pm_api_spring.service;

import com.ralastra.pm_api_spring.dto.LoginRequest;
import com.ralastra.pm_api_spring.dto.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest request);
}
