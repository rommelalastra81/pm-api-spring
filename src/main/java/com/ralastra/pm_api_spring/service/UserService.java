package com.ralastra.pm_api_spring.service;

import com.ralastra.pm_api_spring.dto.CreateUserRequest;
import com.ralastra.pm_api_spring.dto.UpdateUserRequest;
import com.ralastra.pm_api_spring.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(CreateUserRequest request);
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(Long id, UpdateUserRequest request);
    void deleteUser(Long id);
}
