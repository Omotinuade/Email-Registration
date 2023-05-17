package com.example.EmailRegistration.services;

import com.example.EmailRegistration.dtos.request.RegisterUserRequest;
import com.example.EmailRegistration.dtos.response.RegisterUserResponse;
import com.example.EmailRegistration.exceptions.VerificationException;
import com.example.EmailRegistration.models.EmailUser;
import com.example.EmailRegistration.repositories.UserRepository;
import com.example.EmailRegistration.utils.Mapper;
import com.example.EmailRegistration.utils.Verification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.function.Supplier;
@Service
public class EmailServiceImpl implements EmailServiceInterface {
    @Autowired
    private UserRepository userRepository;

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) throws VerificationException {
        EmailUser user = Mapper.mapRegisterRequestToUser(registerUserRequest);

        Verification.verifyPassword(user.getPassword());
        user.setEmailAddress(emailGenerator(user.getUserName()));
        userRepository.save(user);
        return new RegisterUserResponse("Hi "+user.getFirstName() + " \n You have been registered successfully! ");
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    public String emailGenerator(String userName){
        Supplier<Integer> numberSupp= ()-> new SecureRandom().nextInt(10, 100);
        return userName + numberSupp.get()+ "@umail.com";
    }



}
