# Password Strength Checker 🔐

This Java program was created for the Cognizant Externship – Java Fundamentals module.

## 📋 Description
This interactive script evaluates the strength of a password using the following criteria:
- Minimum of 8 characters  
- Contains at least one uppercase letter  
- Contains at least one lowercase letter  
- Contains at least one digit  
- Includes at least one special character  

If the password passes all checks, the program prints a success message.  
If not, it provides feedback about what is missing. It also gives a strength score out of 10.

## 🧪 Sample Output
Enter a password: Python@123  
Your password is strong! 💪  
Password Strength: 10/10

Enter a password: python123  
Your password needs: one uppercase letter, one special character.  
Password Strength: 6/10

## 🛠 How to Run
- Compile: `javac PasswordChecker.java`  
- Run: `java PasswordChecker`
