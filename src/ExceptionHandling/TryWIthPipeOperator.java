package ExceptionHandling;

public class TryWIthPipeOperator {

    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3, 4};
            System.err.println(arr[5]);

            String s = null;
            System.err.println(s);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException |
                 NumberFormatException e) {
            System.err.println("Unwanted Error.." + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//.err=> Used specifically for immediate warnings, error dumps (like stack traces), and diagnostic messages