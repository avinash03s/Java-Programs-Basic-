package QuestionPractic;

//Take the length and breadth of a rectangle and calculate its area.

import java.util.Scanner;

public class _NineQuestionOp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length");
        int length= sc.nextInt();
        System.out.println("Enter Breadth");
        int breadth=sc.nextInt();
        int area=length*breadth;
        System.out.println("Rectangle Area is :" +area);
    }
}
