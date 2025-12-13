package ExceptionHandling;

import java.io.IOException;

public class SuperClass {
    void m1()throws IOException,ClassNotFoundException{
        System.out.println("SuperClass.m1");
    }
}
class SubClass extends SuperClass{
    @Override
    void m1() throws ArithmeticException{
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        SubClass ob= new SubClass();
        ob.m1();
    }
}
