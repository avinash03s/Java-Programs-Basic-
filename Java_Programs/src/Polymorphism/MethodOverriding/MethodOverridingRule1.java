package Polymorphism.MethodOverriding;

//in java a method can only be override in subclass not in same class

public class MethodOverridingRule1 {

    void play(){
        System.out.println("Play cricket..");
    }
}
class Subclass extends MethodOverridingRule1{
    @Override
    void play() {
        System.out.println("Method are override in subclass");
    }

    public static void main(String[] args) {
        Subclass ob= new Subclass();
        ob.play();

        MethodOverridingRule1 obj= new MethodOverridingRule1();
        obj.play();
    }
}
