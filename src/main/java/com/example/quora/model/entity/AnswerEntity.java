package com.example.quora.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AnswerEntity 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long AnswerId;

    private String answerText;

    private Long UserId;

    
}
