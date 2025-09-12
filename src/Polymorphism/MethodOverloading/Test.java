package Polymorphism.MethodOverloading;

public class Test {
    void methodOne(int i){
        System.out.println("int- arg method");
    }

    void methodOne(float f){
        System.out.println("float-args method");
    }

    public static void main(String[] args) {
        Test ob= new Test();
        ob.methodOne('a');
        ob.methodOne('b');
        ob.methodOne(2.23f);
    }
}
