package com.example.quora.web.controller;

import com.example.quora.model.dto.request.QuestionRequest;
import com.example.quora.model.dto.response.QuestionResponse;
import com.example.quora.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController 
{

    @Autowired
    QuestionService questionService;

    @PostMapping("/question")
    public QuestionResponse createQuestion(@RequestBody QuestionRequest request)
    {
        return questionService.createQuestion(request);
    }

    @DeleteMapping("/question")
    public String deleteAQuestion(@RequestBody QuestionRequest request)
    {
        return questionService.deleteQuestion(request);
    }
}
