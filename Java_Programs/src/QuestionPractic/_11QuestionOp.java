package QuestionPractic;

//Take the radius of a circle and calculate the area using formula 3.14 \* radius \* radius.

import java.util.Scanner;

public class _11QuestionOp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius= sc.nextInt();
        double area;
        area=3.14*radius*radius;
        System.out.println("circle area :"+area);
    }
}
