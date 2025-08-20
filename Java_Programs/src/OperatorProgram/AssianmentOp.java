package OperatorProgram;

import java.util.Scanner;

public class AssianmentOp {
    public static void main(String[] args) {
        /*int a=40;
        System.out.println(a+=10);//50
        System.out.println(a-=10);//40
        System.out.println(a*=10);//400
        System.out.println(a/=10);//40
        System.out.println(a%=10);//0
        System.out.println(a>=10);//flase(1)
        System.out.println(a<=10);//true(0)
        System.out.println(a);//0*/

        /*int a=40,b=50;
        int c=a*=b;
        System.out.println(c);

        int x=500; int y=5;
        int z=x/=y;
        System.out.println(z);*/
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b=0;
        System.out.println("Enter Value of a");
        a=sc.nextInt();
        System.out.println("Enter value of b");
        b=sc.nextInt();
        int c= a+b;
        int d=a*b;
        int e=a/b;
        boolean f=a>=b;
        int g=a>>b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
