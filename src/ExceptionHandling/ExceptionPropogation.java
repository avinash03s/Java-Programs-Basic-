package ExceptionHandling;

public class ExceptionPropogation {

    public static void main(String[] args) throws RuntimeException {
        ExceptionPropogation ob= new ExceptionPropogation();
        ob.a();
    }

    void a() throws RuntimeException{
        b();
    }

    void b() throws RuntimeException{
        c();
    }

    void c() throws RuntimeException{
        try {
            System.out.println("Exception Error"+10/0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*Exception Propogation in java refers to the mechanism where an exception
* if not handle in the method where it occurs, is automatically passed up the calling method(call stack).*/
