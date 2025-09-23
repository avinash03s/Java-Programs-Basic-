package QuestionPractic.NumberPrinting;

//Write a program to find sum of all odd numbers between 1 to n

import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        int sum=0;
        for (int i=1;i<=num;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of Odd Number :"+sum);
    }
}
