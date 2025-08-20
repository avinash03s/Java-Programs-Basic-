package FlowControlStatement;

import java.util.Scanner;

//if-else Statement

public class VoterCriteria {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("Enter Your age");
         age=sc.nextInt();
        if (age>=18){
            System.out.println("Elegible for vote");
        }else {
            System.out.println("Not eleagible for vote");
        }
    }
}
