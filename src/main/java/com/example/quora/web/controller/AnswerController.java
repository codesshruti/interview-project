package com.example.quora.web.controller;

import com.example.quora.model.dto.request.QuestionRequest;
import com.example.quora.model.entity.AnswerEntity;
import com.example.quora.service.AnswerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController 
{
    @Autowired
    AnswerService answerService;

    @PostMapping("/answer")
    public AnswerEntity createQuestion(@RequestBody AnswerEntity entity)
    {
        return answerService.answerAQues(entity);
    }
    
}
