package FlowControlStatement;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        int no;
        String day = null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No");
        no=sc.nextInt();
        switch (no){
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tu";
                break;
            case 3:
                day="Wed";
                break;
            case 4:
                day="Thu";
                break;
            case 5:
                day="Fri";
                break;
            case 6:
                day="Sat";
                break;
            case 7:
                day="Sun";
                break;
        }
        System.out.println(day);
    }
}
