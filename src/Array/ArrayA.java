package Array;

import java.util.Arrays;

public class ArrayA {
    public static void main(String[] args) {
       String str1="Avinash";
       String str2="Surwase";

          str1=str1+str2;
          str2=str1.substring(0,str1.length()-str2.length());
          str1=str1.substring(str2.length());
        System.out.print(str1+" "+str2);


    }
}
