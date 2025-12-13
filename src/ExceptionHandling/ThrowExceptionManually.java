package ExceptionHandling;

public class ThrowExceptionManually extends RuntimeException {

    ThrowExceptionManually(){
        super();
    }

    ThrowExceptionManually(String msg){
        super(msg);
    }
    public static void main(String[] args) {

        try {
            ThrowExceptionManually ob= new ThrowExceptionManually();
            throw ob;
        } catch (ThrowExceptionManually e) {
            System.out.println("Custom Exception and Manually throw Exception..");
           e.printStackTrace();
        }
    }
}
