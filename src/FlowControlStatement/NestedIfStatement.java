package FlowControlStatement;

import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Mark");
        a=sc.nextInt();
        if (a==10 || a<50){

            if (a<50){
                System.out.println("a is smaller than 50");

                if (a<60){
                    System.out.println("a is smaller than 60");
                }
            }

            }else {
            System.out.println("No execute");
        }
    }
}
