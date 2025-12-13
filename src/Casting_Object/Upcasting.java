package Casting_Object;

public class Upcasting {

    void show() {
        System.out.println("Parent Class Method");
    }

    void run(){
        System.out.println("Parent Class Run Method");
    }
}

class Child extends Upcasting {
    @Override
    void show() {
        run();
        System.err.println("Child class Method");
    }
}

class Main {
    public static void main(String[] args) {
        Upcasting ob = new Child();
        ob.run();
        ob.show();
    }
}
