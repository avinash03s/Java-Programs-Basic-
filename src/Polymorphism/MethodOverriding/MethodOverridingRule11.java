package Polymorphism.MethodOverriding;

public class MethodOverridingRule11 {
    void play()  {
        System.out.println(10 / 0);
    }
}

class Child45 extends MethodOverridingRule11 {
    @Override
    void play() {
        System.out.println("Child Class Method");
    }
}

class Main {
    public static void main(String[] args) {

        MethodOverridingRule11 ob = new Child45();//upcasting
        ob.play();
    }
}
