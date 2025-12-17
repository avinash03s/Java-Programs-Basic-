package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

    private double balance = 5000;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new CustomException("Insufficient balance! Withdrawal failed.");
        } else if (amount <= 0) {
            throw new InputMismatchException("Please Enter Valid Input..");
        } else {
            balance -= amount;
            System.out.println(amount + " " + "WithDraw Successful..");
        }
    }

    void userInput(Bank obj) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter With Draw Amount");
            double userAmount = sc.nextInt();

            obj.withdraw(userAmount);
        } catch (CustomException e) {
            System.err.println("Error.." + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Error.." + e.getMessage());
        }
    }
}

class MainApp {

    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.userInput(obj);
    }
}
