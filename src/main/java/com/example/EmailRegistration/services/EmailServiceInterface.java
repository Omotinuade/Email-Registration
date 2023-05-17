package com.example.EmailRegistration.services;

import com.example.EmailRegistration.dtos.request.RegisterUserRequest;
import com.example.EmailRegistration.dtos.response.RegisterUserResponse;
import com.example.EmailRegistration.exceptions.VerificationException;

public interface EmailServiceInterface {


    RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) throws VerificationException;

    long count();
}
    
   
