package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationRegex {
    public void checkFirstName(String name) {
        boolean isMatched = Pattern.compile("^[A-Z][a-zA-Z]{2,}").matcher(name).matches();
        if (isMatched) {
            System.out.println("It is valid name");
        } else {
            System.out.println("It is not a valid name");
        }
    }

    public void checkLastName(String lastName) {
        boolean isMatched = Pattern.compile("^[A-Z][a-zA-Z]{2,}").matcher(lastName).matches();
        if (isMatched) {
            System.out.println("It is valid name");
        } else {
            System.out.println("It is not a valid name");
        }
    }

    public void checkEmail(String email) {
        boolean isMatched = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.]+$").matcher(email).matches();
        if(isMatched){
            System.out.println("It is valid email");
        }
        else{
            System.out.println("It is not a valid email");
        }
    }
}
