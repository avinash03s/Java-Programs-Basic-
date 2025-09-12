package Polymorphism.MethodOverriding;

class Parent{
    String sc="Avi";
    String give(){
        System.out.println("String class method");
        return "java";
    }

    Object ob= new Object();
    Object make(){
        System.out.println("Object class method");
        return new Object();
    }

    Parent taken(){
        System.out.println("Parent property");
        return new Parent();
    }
}
class Child extends Parent{
    Child taken(){
       super.taken();
        System.out.println("Child taken parent property");
        return new Child();
    }

    @Override
    String give() {
       super.give();
        System.out.println("Hi");
        return "java";
    }

    @Override
    Object make() {
        super.make();
        System.out.println("hello");
        return new Object();
    }
}
public class ObjectReturnType {
    public static void main(String[] args) {
        Child ob= new Child();
        ob.taken();
        ob.give();
        ob.make();

    }
}
