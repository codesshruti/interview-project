package com.example.quora.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPoJo 
{
    private Long id;

    private String username;

    private String role;
    
}
