package ExceptionHandling;

public class IntroException {
    public static void main(String[] args) {
        IntroException ob= new IntroException();
        ob.divided(100,0);
    }

    void divided(int a ,int b){
        int c=a/b;
        System.out.println("Divided :"+c);
    }

}
// Exception Reason : User Enter Invalid Input
//Exception Name: ArithmeticException
