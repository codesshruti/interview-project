package com.example.quora.commons.converter;

import com.example.quora.model.dto.request.UserRequest;
import com.example.quora.model.dto.response.UserResponse;
import com.example.quora.model.entity.UserEntity;

public class UserConverter 
{
    public static UserEntity requestToEntity(UserRequest request)
    {
        UserEntity entity = new UserEntity();
        
        entity.setId(request.getId());
        entity.setRole(request.getRole());
        entity.setUsername(request.getUsername());

        return entity;

    }
    

    public static UserResponse entityToResponse(UserEntity entity)
    {
        UserResponse response = new UserResponse();
        
        response.setId(entity.getId());
        response.setRole(entity.getRole());
        response.setUsername(entity.getUsername());

        return response;

    }
}
