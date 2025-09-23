package QuestionPractic.NumberPrinting;

import java.util.Scanner;

public class MultiOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        int multi=1;
        for (int i=1;i<=num;i++){
            if (i%2==0){
                multi*=i;
            }
        }
        System.out.println("Multi of Even Number :"+multi);
    }
}
