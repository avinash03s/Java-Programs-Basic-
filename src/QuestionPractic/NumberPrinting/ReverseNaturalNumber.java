package QuestionPractic.NumberPrinting;

//Write a program to print all natural numbers in reverse


import java.util.Scanner;

public class ReverseNaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        for (int i=num-1;i>=1;i--){
            System.out.println(i);
        }
    }

}
