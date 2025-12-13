package ExceptionHandling;

public class IntroThrow {

    public static void main(String[] args) throws Exception {
        IntroThrow ob= new IntroThrow();
        ob.test();
    }

    void test() throws RuntimeException{
        System.out.println("Result: "+10/0);
        throw new ArithmeticException();
    }
}
