package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age=sc.nextInt();

        try {
            if (age<0){
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
