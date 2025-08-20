package FlowControlStatement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Number =0;
        System.out.println("Enter Number");
        Number=sc.nextInt();
        String Month = "Jan";
        switch (Number){
            case 1:
                Month="Jan";
                break;
            case 2:
                Month="Feb";
                break;
            case 3:
                Month="March";
                break;
            case 4:
                Month="April";
                break;
            case 5:
                Month="May";
                break;
            case 6:
                Month="June";
                break;
            case 7:
                Month="July";
                break;
            case 8:
                Month="Aug";
                break;
            case 9:
                Month="Sep";
                break;
            case 10:
                Month="Nov";
                break;
            case 11:
                Month="Dec";
                break;

        }
        System.out.println(Month);
    }
}
