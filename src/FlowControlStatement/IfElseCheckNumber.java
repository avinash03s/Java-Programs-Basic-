package FlowControlStatement;

import java.util.Scanner;

public class IfElseCheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        if (num>0){
            System.out.println("Positive Number");
        } else if (num<0) {
            System.out.println("Negative Number");

        }else{
            System.out.println("Zero number");
        }
        System.out.println(num);
    }

}
