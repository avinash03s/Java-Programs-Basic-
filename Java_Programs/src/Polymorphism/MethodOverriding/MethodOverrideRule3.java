package Polymorphism.MethodOverriding;

/*Return type must be same for both parent and child class method
* ==>Primitive Data Type*/


public class MethodOverrideRule3 {

    int sum(){
        System.out.println("sum of these any number");
        return 44;
    }
    boolean condition(){
        System.out.println("condition are "+condition());
        return true;
    }
    void add(){
        System.out.println("add any number");
    }
}
class Rule3 extends MethodOverrideRule3{
    @Override
    int sum() {
        super.sum();
        System.out.println("Sum method are override");
        return 45;
    }

    @Override
    boolean condition() {
       // super.condition();
        System.out.println("condition method are override");
        return true;
    }

    @Override
    void add() {
        //super.add();
        System.out.println("add method are override");
    }

    public static void main(String[] args) {
        Rule3 ob= new Rule3();
        ob.sum();
        ob.condition();
        ob.add();
    }
}
