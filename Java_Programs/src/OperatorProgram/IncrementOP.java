package OperatorProgram;

public class IncrementOP {
    public static void main(String[] args) {
       /* int a= 100;
        System.out.println(a++); //100
        System.out.println(a);*/

      /*  int a= 20;
        System.out.println(++a); //21
        System.out.println(a--); //21
        //20
        System.out.println(a++); //20
        // 21
        System.out.println(--a); //20*/
        int a= 20;
        int b= a++;
        int c= ++a;
        System.out.println(a);
        System.out.println(c);


    }
}
