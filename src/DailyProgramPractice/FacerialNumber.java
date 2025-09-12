package DailyProgramPractice;

import java.util.Scanner;

public class FacerialNumber {
    public static void main(String[] args) {
        int num=5;
        int factorial=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Number");
        num=sc.nextInt();
        for (int i=1;i<=num;++i);{
            factorial*=1;
        }
        System.out.println(num+factorial);
    }
}
