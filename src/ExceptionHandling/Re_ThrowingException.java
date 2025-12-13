package ExceptionHandling;

public class Re_ThrowingException {

    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException is caught here");
            throw e;
        }
    }
}
//this program is re-throwing Exception;