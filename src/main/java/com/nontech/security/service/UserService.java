package com.nontech.security.service;

import com.nontech.security.dto.UserDTO;
import com.nontech.security.models.User;

import java.util.List;

public interface UserService {

    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}
