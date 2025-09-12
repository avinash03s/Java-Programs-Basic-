package FlowControlStatement;

import java.util.Scanner;

public class GessPositiveNegative {
    public static void main(String[] args) {
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Number");
        number=sc.nextInt();
        if (number<0){
            System.out.println("Number is + ive");
            if (number>0){
                System.out.println("Number is -ive");
            }
        }
    }
}
