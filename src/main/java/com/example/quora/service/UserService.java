package com.example.quora.service;

import com.example.quora.model.dto.request.UserRequest;
import com.example.quora.model.dto.response.UserResponse;

public interface UserService 
{
    public UserResponse createUser(UserRequest request);

}
