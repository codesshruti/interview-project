package com.example.quora.service.impl;

import com.example.quora.commons.converter.QuestionConverter;
import com.example.quora.model.dto.request.QuestionRequest;
import com.example.quora.model.dto.response.QuestionResponse;
import com.example.quora.model.entity.QuestionEntity;
import com.example.quora.model.entity.UserEntity;
import com.example.quora.model.repo.QuestionRepository;
import com.example.quora.model.repo.UserRepository;
import com.example.quora.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService
{

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public QuestionResponse createQuestion(QuestionRequest request) 
    {
        return QuestionConverter.entityToResponse(questionRepository.save(QuestionConverter.requestToEntity(request)));
    }

    @Override
    public String deleteQuestion(QuestionRequest request) 
    {
        UserEntity entity = userRepository.findById(request.getUserId()).get();

        if(entity.getRole().equals("admin"))
        {
            questionRepository.deleteById(request.getQuestionId());
            return "Succesfully Deleted";
        }

        else
            return "You are not authorized to delete it.";

        
    }

    
}
