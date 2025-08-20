package DailyProgramPractice;

import java.util.Scanner;

public class FindEvenNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Number");
        num=sc.nextInt();
        if (num%2==0){
            System.out.println("Your Number is even");
        }else {
            System.out.println("Your Number is odd");
        }

    }
}
