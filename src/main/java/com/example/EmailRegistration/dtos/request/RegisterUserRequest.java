package com.example.EmailRegistration.dtos.request;

import com.example.EmailRegistration.models.Address;
import lombok.Data;

@Data
public class RegisterUserRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String phoneNumber;
    private Address address;
}
