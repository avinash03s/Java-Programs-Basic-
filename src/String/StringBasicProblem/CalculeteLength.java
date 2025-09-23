package String.StringBasicProblem;

//Write a program to input a string and print its length.

import java.util.Scanner;

public class CalculeteLength {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your String");
        String s=sc.nextLine();
        System.out.println("String Length is: "+s.length());
    }
}
