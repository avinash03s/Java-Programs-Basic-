package Polymorphism.MethodOverloading;

public class DTest2 {
    void methodOne(String s){
        System.out.println("String version");

    }
    void methodOne(StringBuffer s){
        System.out.println("StringBuffer version");
    }

    public static void main(String[] args) {
        DTest2 ob= new DTest2();
        ob.methodOne("Java");
        ob.methodOne(new StringBuffer("Avi"));
    }
}
