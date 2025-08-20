package OperatorProgram;

public class DecreementOp {
    public static void main(String[] args) {
        int a=100;
        System.out.println(a--);//post decree (100)
        System.out.println(a);//99

        int b=200;
        System.out.println(--b);//pre decree (199)
        System.out.println(b); //199
    }
}
