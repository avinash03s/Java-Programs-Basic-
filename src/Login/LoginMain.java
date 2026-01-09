package Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginMain extends Register {
    LoginMain() {
        super(" ", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Register> setIdPassword = new ArrayList<>();   //list Class for storing Temmpory data

        LoginMain ob = new LoginMain();

        while (true) {
            System.out.println("------AgroStack-----");
            System.out.println("1. Register yourself");
            System.out.println("2. Login");
            System.out.println("3. Exit..!");
            // System.out.println();
            System.out.println("Select Option");
            int select = sc.nextInt();
            sc.nextLine();

            String userId = "";
            String setPassword = "";
            int max = 3;
            //logic
            switch (select) {
                case 1:
                    System.out.println("Enter New 3 Digit UserId");
                    userId = sc.nextLine();

                    if (userId.length() > max) {
                        System.out.println("Error..Invalid...!");
                        break;
                    }

                    System.out.println("Enter New Password");
                    setPassword = sc.nextLine();

                    setIdPassword.add(new Register(userId, setPassword));//list method

                    System.out.println("Register Successful..! ");
                    break;

                case 2:
                    System.out.println("Enter Id");
                    String id = sc.nextLine();
                    System.out.println("Enter Password");
                    String password = sc.nextLine();

                    boolean correct = false;
                    for (int i = 0; i < setIdPassword.size(); i++) {
                        Register set = setIdPassword.get(i);
                        if (set.getUserId().equals(id) && set.getPassword().equals(password)) {
                            correct = true;
                        }
                    }

                    if (correct) {
                        System.out.println("Login Successful...!");
                    } else if (!correct){
                        System.out.println("Please Register first..");
                    }else {
                        System.out.println("Incorrect Detail..! Please Enter Correct Information..!");
                    }
                    break;

                case 3:
                    System.out.println("\"\uD83D\uDC4B Thank you for using AgroStack!\"");
                    System.exit(0); //this .exit method used to off jvm;
                    break;
            }

        }

    }
}
