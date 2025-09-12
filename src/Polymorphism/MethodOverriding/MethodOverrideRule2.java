package Polymorphism.MethodOverriding;

/*Method signature must ve exactly the sam as parent class method*/


public class MethodOverrideRule2 {

    void run(){
        System.out.println("Parent run fast");
    }

}
class Rule2 extends MethodOverrideRule2{
    @Override
    void run() {
        super.run();
        System.out.println("Child run slow");
    }

    public static void main(String[] args) {
        Rule2 ob= new Rule2();
        ob.run();
    }
}
