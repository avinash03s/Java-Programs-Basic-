package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class User {

    void userInput() {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter First Number");
            int num = sc.nextInt();

            System.out.println("Enter Second Number");
            int num2 = sc.nextInt();

            int result = num / num2;
            System.out.println("Result is : " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.err.println("Error: Please enter valid integers only.");
        } catch (Exception e) {
            System.out.println("Sorry Invalid...");
        }
    }
}

public class ExceptionHandilngPractice {

    public static void main(String[] args) {
        User obj = new User();
        obj.userInput();
    }
}
