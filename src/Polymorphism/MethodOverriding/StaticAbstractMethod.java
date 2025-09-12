package Polymorphism.MethodOverriding;

public abstract class StaticAbstractMethod {
    abstract void make();
    abstract void make(int a);
    protected void taken(){
        System.out.println("hey");
    }
    static void play(){
        System.out.println("Playing cricket");///these method are hide
    }
}
class A extends StaticAbstractMethod{
    @Override
    void make() {
        System.out.println("hi");
    }

    @Override
    void make(int a) {
        System.out.println("Avi"+" "+a);
    }

    @Override
    protected void taken() {
        System.out.println("hello");
    }

    static void play(){
       // super.play();
        System.out.println("Super or big fan of Ro45");
    }

    public static void main(String[] args) {
        StaticAbstractMethod ob= new A();
        ob.make();
        A.play();
        ob.make(45);

        ob.taken();
    }
}
