package Array;

public class ArrayFirstP {
    //syntax 1.
    int number=100;
    int [] intArray=new int[50];


    public static void main(String[] args) {
        int [] intArray=new int[10];
        intArray[0]=100;
        intArray[1]=200;
        intArray[2]=300;
        intArray[3]=400;
        intArray[4]=500;
        intArray[5]=600;
        intArray[6]=700;
        intArray[7]=800;
        intArray[8]=900;
        intArray[9]=1000;
        System.out.println(intArray[7]);

        //syntax 2

        int[]Arraymet={100,200,300,400,500,600,700,800,900,1000};
        //              0   1   2   3   4   5   6   7   8    9      (Array sorting)
        System.out.println(Arraymet[3]);
    }
}
/*This program is define to syntax of array
1 st i enter int type value and then i declear array size then write main method and under main method i create array
and then use array reference to indicate array location to store value/data

2nd syntax is very easy to write
simply declear array and then under curly bracket to add data/value.
 */
