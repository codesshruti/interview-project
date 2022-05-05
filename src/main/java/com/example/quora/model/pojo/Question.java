package com.example.quora.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question 
{
    
    private Long questionId;

    private String questionText;

    private Long userId;
    
}
