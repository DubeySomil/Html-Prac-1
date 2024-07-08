package com.somil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.somil.models.User;
import com.somil.repository.UserRepo;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class UserController {
    
    @Autowired
    UserRepo userRepo;

//    @Operation(summary = "Creates permanent customized view for a given On-Demand revision of an entity", description = "saves permanent customized view for a given On-Demand revision of the user's entity", method = "POST")
    @PostMapping("/User")
    public User createUser(@RequestBody User user) throws Exception {
        User userExist = findByEmail(user.getEmail());
        userRepo.save(userExist);
        return user;
    }

    public User findByEmail(String email) throws Exception{
        User user = userRepo.findByEmail(email);
        if(user != null) {
            throw new Exception("User already exist with email : " + email);
        }
        return user;
    }
}
