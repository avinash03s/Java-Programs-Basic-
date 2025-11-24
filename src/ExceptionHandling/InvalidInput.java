package ExceptionHandling;

public class InvalidInput {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("InvalidInput.main");
    }
}
