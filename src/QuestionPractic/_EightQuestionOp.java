package QuestionPractic;

// Take a number and print its cube.

import java.util.Scanner;

public class _EightQuestionOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 side");
        int side1=sc.nextInt();
        System.out.println("Enter 2nd side");
        int side2= sc.nextInt();
        System.out.println("Enter 3rd side");
        int side3=sc.nextInt();
        int cube;
        System.out.println(cube=side1*side2*side3);
    }
}
