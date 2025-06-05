/*
Project: Password Strength Checker
For Cognizant Externship – Java Fundamentals

Description:
This program checks the strength of a password based on:
- Minimum length of 8 characters
- At least one uppercase letter
- At least one lowercase letter
- At least one digit
- At least one special character
It also provides a score out of 10.

Jordan Wang
June 5, 2025
*/

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasMinLength = password.length() >= 8;

        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (specialCharacters.contains(Character.toString(ch))) hasSpecial = true;
        }

        StringBuilder feedback = new StringBuilder();
        if (!hasMinLength) feedback.append("at least 8 characters, ");
        if (!hasUpper) feedback.append("one uppercase letter, ");
        if (!hasLower) feedback.append("one lowercase letter, ");
        if (!hasDigit) feedback.append("one digit, ");
        if (!hasSpecial) feedback.append("one special character, ");

        if (feedback.length() == 0) {
            System.out.println("Your password is strong! 💪");
        } else {
            // Remove trailing comma and space
            String result = feedback.substring(0, feedback.length() - 2);
            System.out.println("Your password needs: " + result + ".");
        }

        // Bonus: strength score
        int score = 2; // base
        if (hasMinLength) score += 2;
        if (hasUpper) score += 2;
        if (hasLower) score += 1;
        if (hasDigit) score += 1;
        if (hasSpecial) score += 2;

        System.out.println("Password Strength: " + score + "/10");

        scanner.close();
    }
}
