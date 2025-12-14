package ExceptionHandling;

import java.util.Scanner;

public class UnderAgeException extends RuntimeException {
    UnderAgeException(String msg) {
        super(msg);
    }
}

class Register {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new UnderAgeException("Stop! The user is too young!");
            }
            System.out.println("Register Successful..!");
        } catch (UnderAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}