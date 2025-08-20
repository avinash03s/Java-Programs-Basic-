package QuestionPractic;

//Take the radius of a circle and calculate the circumference using formula 2 \* 3.14 \* radius.

import java.util.Scanner;

public class _12QuestionOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius=sc.nextInt();
        double circumference;
        circumference=2*3.14*radius;
        System.out.println("circimference is :"+circumference);

    }
}
