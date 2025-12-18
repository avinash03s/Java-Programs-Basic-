package InterviewQuestions;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String to remove whitespaces ");
        String inputString = sc.nextLine();
        String withoutSpaces = inputString.replaceAll("\\s+", "");
//        String withoutSpaces = inputString.trim();
        System.out.println("Input String : " + inputString);
        System.out.println("Remove whiteSpace String : " + withoutSpaces);

        //using trim();

    }
}
