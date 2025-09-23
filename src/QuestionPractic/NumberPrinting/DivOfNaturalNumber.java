package QuestionPractic.NumberPrinting;

import java.util.Scanner;

public class DivOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        int div=1;
        for (int i=1;i<=num;i++){
            div/=i;
        }
        System.out.println(div);
    }
}
