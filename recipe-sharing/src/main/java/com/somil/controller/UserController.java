package com.somil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.somil.models.User;
import com.somil.repository.UserRepository;

@RestController
public class UserController {
    
    @Autowired
    UserRepository userRepository;

//    @Operation(summary = "Creates permanent customized view for a given On-Demand revision of an entity", description = "saves permanent customized view for a given On-Demand revision of the user's entity", method = "POST")
    @PostMapping("/User")
    public User createUser(@RequestBody User user) throws Exception {
        User userExist = findByEmail(user.getEmail());
        userRepository.save(userExist);
        return user;
    }

    public User findByEmail(String email) throws Exception{
        User user = userRepository.findByEmail(email);
        if(user != null) {
            throw new Exception("User already exist with email : " + email);
        }
        return user;
    }
}
