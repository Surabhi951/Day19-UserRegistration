package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationRegex {
    public void checkFirstName(String name)
    {
        boolean isMatched = Pattern.compile("^[A-Z][a-zA-Z]{2,}").matcher(name).matches();
        if(isMatched)
        {
            System.out.println("It is valid name");
        }
        else
        {
            System.out.println("It is not a valid name");
        }
    }
}
