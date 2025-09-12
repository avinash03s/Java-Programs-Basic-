package Polymorphism.MethodOverloading;

public class DTest {
    void methodOne(String s){
        System.out.println("String version");
    }

    void methodOne(Object o){
        System.out.println("Object version");
    }

    public static void main(String[] args) {
        DTest ob= new DTest();
        ob.methodOne("avinash");
        ob.methodOne(new Object());
    }
}
