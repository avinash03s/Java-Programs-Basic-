package ExceptionHandling;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Price: ");
        int totalPrice = sc.nextInt();

        System.out.println("Enter Quantity: ");
        int quantity = sc.nextInt();

        try {

            if (quantity <= 0) {
                throw new ArithmeticException("Cannot divided by zero..");
            }

            int cost = totalPrice / quantity;
            System.out.println("Your Total cost is: " + cost);

        } catch (ArithmeticException e) {
            System.err.println("Error.." + e.getMessage());
        }
    }
}
