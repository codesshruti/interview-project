package com.example.quora.service;

import com.example.quora.model.dto.request.QuestionRequest;
import com.example.quora.model.dto.response.QuestionResponse;

public interface QuestionService 
{
    public QuestionResponse createQuestion(QuestionRequest request);

    public String deleteQuestion(QuestionRequest request);

}
