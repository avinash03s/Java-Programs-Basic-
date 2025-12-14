package ExceptionHandling;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Transfer Amount: ");
        String tAmount = sc.nextLine();

        try {
            double amount = Double.parseDouble(tAmount);
            System.out.println(amount);
            System.out.println("Transfer Successful");
        } catch (NumberFormatException e) {
            System.err.println("Invalid Amount Please Enter Valid Amount");
        }
    }
}
