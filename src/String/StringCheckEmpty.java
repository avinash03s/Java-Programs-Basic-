package String;

import java.util.Scanner;

public class StringCheckEmpty {


    void checkYourString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String string = sc.nextLine();

        for (int i = 0; i <= string.length(); i++) {
            if (string.length() == 0) {
                System.err.println("Your String is Empty..!");
            } else {
                System.out.println("Your String is : " + string);
                System.exit(0);
            }
        }

    }

    public static void main(String[] args) {
        StringCheckEmpty ob = new StringCheckEmpty();
        ob.checkYourString();
    }
}
//in this code without using isEmpty() method check their String are Empty or not;