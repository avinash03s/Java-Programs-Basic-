package ExceptionHandling;

public class ClassCastExceptionHandling {

    void run(){
        System.out.println("Parent Class Run method");
    }
}
class Child extends ClassCastExceptionHandling{

    @Override
    void run(){
        System.err.println("Child Class Run Method");
    }
}
class Main{

    public static void main(String[] args) {
        try {
            Child ob= (Child) new ClassCastExceptionHandling();
            ob.run();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
