package QuestionPractic.NumberPrinting;

//Write a program to print reverse tables

import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        for (int i=10;i>=1;i--){
            System.out.println(num*i);
        }
    }
}
