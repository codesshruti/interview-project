package com.example.quora.service.impl;

import com.example.quora.commons.converter.UserConverter;
import com.example.quora.model.dto.request.UserRequest;
import com.example.quora.model.dto.response.UserResponse;
import com.example.quora.model.repo.UserRepository;
import com.example.quora.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponse createUser(UserRequest request) 
    {
        return UserConverter.entityToResponse(userRepository.save(UserConverter.requestToEntity(request)));
    }
    
}
