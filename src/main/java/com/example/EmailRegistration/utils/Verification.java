package com.example.EmailRegistration.utils;

import com.example.EmailRegistration.exceptions.VerificationException;

import java.util.regex.Pattern;

public class Verification {
    private static final String PASSWORD_PATTERN= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
    private static final String EMAIL_PATTERN= "^[a-zA-Z0-9_+&*-]+(?:\\."+")";
    public static  void verifyPassword(String password) throws VerificationException {
            if(!pattern.matcher(password).matches()){
                throw new VerificationException("Invalid password");

    }
}}
