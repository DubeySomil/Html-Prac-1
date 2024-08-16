package com.somil.service;

import com.somil.models.User;

public interface UserService {
    public User findUserById(Long id) throws Exception;
}
