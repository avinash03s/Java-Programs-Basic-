package LoopsPractice;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n=sc.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++){
            sum= sum+i;
        }
        System.out.println("Sum of number from 1 to "+ n + "is : "+sum);
    }
}
