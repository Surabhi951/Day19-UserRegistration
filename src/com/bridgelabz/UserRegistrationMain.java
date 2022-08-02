package com.bridgelabz;
import java.util.Scanner;
public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistrationRegex regex = new UserRegistrationRegex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        regex.checkFirstName(firstName);

        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        regex.checkLastName(lastName);

        System.out.println("Enter email");
        String email = scanner.next();
        regex.checkEmail(email);

    }
}
