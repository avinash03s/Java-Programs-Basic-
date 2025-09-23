package QuestionPractic.NumberPrinting;

//. Write a program to print all natural numbers from 1 to n

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }

    }
}
