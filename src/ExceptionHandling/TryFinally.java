package ExceptionHandling;

public class TryFinally {
    public static void main(String[] args) {
        try {
            int res=100/0;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Got exception");
            e.printStackTrace();
        }finally {
            System.out.println("whether exception ocurs or not always executed..");
        }
    }
}
