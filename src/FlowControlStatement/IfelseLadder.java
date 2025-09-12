package FlowControlStatement;

import java.util.Scanner;

public class IfelseLadder {
    public static void main(String[] args) {
        int mark;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Mark");
        mark=sc.nextInt();
        if (mark>=90){
            System.out.println("A grade");
        } else if (mark>=60 && mark<90) {
            System.out.println("B grade");
        } else if (mark>=35 && mark<60) {
            System.out.println("C grade");
        }else if (mark<35){
            System.out.println("Fail");
        }
    }
}

//Write a java program to fing largest given 3 number
