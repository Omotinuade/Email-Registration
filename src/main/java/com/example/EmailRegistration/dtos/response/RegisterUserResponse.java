package com.example.EmailRegistration.dtos.response;

import com.example.EmailRegistration.models.Address;

public class RegisterUserResponse {
   private String message;

    public RegisterUserResponse(String message) {
        this.message = message;
    }
}
