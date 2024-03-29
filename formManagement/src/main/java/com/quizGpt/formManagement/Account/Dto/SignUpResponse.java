package com.quizGpt.formManagement.Account.Dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignUpResponse {
    private String accessToken;
    private String email;
    private int id;
    private List<String> roles;
    private String tokenType;
    private String username;
    private String password;
    private String statusCode;
    private int statusCodeValue;
}

