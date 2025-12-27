package ExceptionHandling;

public class ModuleByZero {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a % b;
            System.out.println(result);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
