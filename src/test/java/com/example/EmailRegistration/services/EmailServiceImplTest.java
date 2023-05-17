package com.example.EmailRegistration.services;

import com.example.EmailRegistration.dtos.request.RegisterUserRequest;
import com.example.EmailRegistration.exceptions.VerificationException;
import com.example.EmailRegistration.models.Address;
import com.example.EmailRegistration.repositories.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmailServiceImplTest {

    @Autowired
    private EmailServiceInterface emailServiceInterface;
    private RegisterUserRequest registerUserRequest;
    private Address address1;

    @BeforeEach
    void setUp() {
        address1 = new Address("312", "herbert macaulay way", "yaba", "Lagos", "Nigeria");

        registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setPassword("Opassword!1");
        registerUserRequest.setFirstName("John");
        registerUserRequest.setLastName("Doe");
        registerUserRequest.setUserName("JDoe");
        registerUserRequest.setAddress(address1);
        registerUserRequest.setPhoneNumber("08023846243");

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatUserCanRegister() throws VerificationException {
        emailServiceInterface.registerUser(registerUserRequest);
        assertEquals(1, emailServiceInterface.count());

    }
}