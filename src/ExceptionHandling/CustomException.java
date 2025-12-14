package ExceptionHandling;

public class CustomException extends RuntimeException {
    CustomException() {
        super();
    }

    CustomException(String msg) {
        super(msg);
    }
}
