package ExceptionHandling;

public class CustomException extends RuntimeException {
    CustomException() {
        super();
    }

    public CustomException(String msg) {
        super(msg);
    }
}
