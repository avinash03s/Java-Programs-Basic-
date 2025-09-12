package Abstraction;

abstract class GrandP{//           abstract class
    abstract void sum();//         abstract method
    void GrandP(){              //  normal method
        System.out.println("Hi");
    }
}
abstract class Child1 extends GrandP{
    @Override
    void sum() {    //    impliments abstract method from Grand class/abstract class
        int a,b,c;
        a=10;
        b=20;
        c=a+b;

    }
}

class Child3 extends GrandP{             //3rd child class extends abstract child class

    @Override
    void sum() {                        // impliments  abstract grand method
        System.out.println("Grand class abstract method ");
    }
}
public class Parent1 {
    public static void main(String[] args) {
        Child3 ob= new Child3();
        ob.sum();

        ob.GrandP();
    }
}
