package com.example.EmailRegistration.utils;

import com.example.EmailRegistration.dtos.request.RegisterUserRequest;
import com.example.EmailRegistration.models.EmailUser;

public class Mapper {
    public static EmailUser mapRegisterRequestToUser(RegisterUserRequest request){
        return EmailUser.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .userName(request.getUserName())
                .phoneNumber(request.getPhoneNumber())
                .address(request.getAddress())
                .password(request.getPassword())
                .build();
    }
}
