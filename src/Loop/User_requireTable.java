package Loop;

import java.util.Scanner;

public class User_requireTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        if (num>0){
            System.out.println("........");
            for (int i=1;i<=10;i++){
                System.out.println(num*i);
            }
        }
    }
}

