package ExceptionHandling;

public class CustomException2 extends RuntimeException {
    String msg;

    CustomException2(String msg) {
        this.msg = msg;
    }
}
