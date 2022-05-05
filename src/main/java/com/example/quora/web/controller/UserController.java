package com.example.quora.web.controller;

import com.example.quora.model.dto.request.UserRequest;
import com.example.quora.model.dto.response.UserResponse;
import com.example.quora.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public UserResponse createUser(@RequestBody UserRequest request)
    {
        return userService.createUser(request);
    }
    
}
