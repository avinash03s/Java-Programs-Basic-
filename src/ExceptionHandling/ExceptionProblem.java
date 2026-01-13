package ExceptionHandling;

public class ExceptionProblem {

    public static void main(String[] args) {
        try {
            System.out.println(10);
            System.out.println(10%0);
            System.out.println(45);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
