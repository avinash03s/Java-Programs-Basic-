package Abstraction;

/* We can not create an object of abstract class.*/

abstract class AbstractionRule3 {
    void run(){
        System.out.println("normal method");
    }
}
class Rule3 extends AbstractionRule3{
    public static void main(String[] args) {
       // AbstractionRule3 ob= new AbstractionRule3()       (Abstract class cannot be instantiated)


    }
}