package com.example.quora.service.impl;

import com.example.quora.model.entity.AnswerEntity;
import com.example.quora.model.repo.AnswerRepository;
import com.example.quora.service.AnswerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService
{

    @Autowired
    AnswerRepository answerRepository;

    @Override
    public AnswerEntity answerAQues(AnswerEntity entity) {

        return answerRepository.save(entity);
    }
    
}
