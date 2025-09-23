package QuestionPractic.NumberPrinting;

//Write a program to print tables

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
