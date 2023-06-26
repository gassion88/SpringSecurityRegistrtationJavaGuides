package com.gassion.springsecurityregistrtationjavaguides.service;

import com.gassion.springsecurityregistrtationjavaguides.dto.UserDTO;
import com.gassion.springsecurityregistrtationjavaguides.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDto);

    User findUserByEmail(String email);

    List<UserDTO> findAllUsers();
}
