package Abstraction;

/*
 abstraction 2nd rule : If we define any abstract method in a class, then that class must be an abstract class
*/

abstract class AbstractionRule2 {

    abstract void add();//               abstract method within abstract class;

}
class Rule2 extends AbstractionRule2{

    @Override
    void add() {
        System.out.println("Abstract method implementation in our child class/ method override ");
    }
}
