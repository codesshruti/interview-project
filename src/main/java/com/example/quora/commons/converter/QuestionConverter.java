package com.example.quora.commons.converter;

import com.example.quora.model.dto.request.QuestionRequest;
import com.example.quora.model.dto.response.QuestionResponse;
import com.example.quora.model.entity.QuestionEntity;

public class QuestionConverter 
{
    public static QuestionEntity requestToEntity(QuestionRequest request)
    {
        QuestionEntity entity = new QuestionEntity();
        
        entity.setQuestionId(request.getQuestionId());
        entity.setQuestionText(request.getQuestionText());
        entity.setUserId(request.getUserId());

        return entity;

    }
    

    public static QuestionResponse entityToResponse(QuestionEntity entity)
    {
        QuestionResponse response = new QuestionResponse();
        
        response.setQuestionId(entity.getQuestionId());
        response.setQuestionText(entity.getQuestionText());
        response.setUserId(entity.getUserId());

        return response;
    }
    
}
