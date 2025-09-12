package Polymorphism.MethodOverriding;

/*method declare as static cannot override but can be re-declare => Method hiding */

public class MethodOverrideRule6 {

    static void display(){
        System.out.print("Static method cannot override "+" ");
    }
}
class Rule6 extends MethodOverrideRule6{
    static void display(){

        System.out.println("but re-declare static method");
    }

    public static void main(String[] args) {
       // MethodOverrideRule6.display();
        Rule6.display();
    }
}
