package ExceptionHandling;

import java.util.Scanner;

class InvalidUserInput extends RuntimeException {
    InvalidUserInput(String msg) {
        super(msg);
    }
}

public class CustomeExceptionProgram {
    public static void main(String[] args) throws InvalidUserInput {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int first = sc.nextInt();

        System.out.println("Enter second Number..");
        int second = sc.nextInt();

       try {

           if (first<=0){
               throw new InvalidUserInput("Please Enter valid Input...");
           }

           if (second <= 0) {
               throw new InvalidUserInput("Please Enter valid Input...");
           }

       } catch (InvalidUserInput e) {
           System.err.println("Error.."+e.getMessage());
       }

    }
}
