package Abstraction;

/*If concrete/non-abstract class extends  abstract class,
then its  mandatory for that child class to provide method implementations of abstract methods of super class.
*/

abstract class AbstractionRule5 {

    abstract void display();
}
class Rule5 extends AbstractionRule5{

    @Override
    void display() {
        System.out.println();      //mandatory for child class to method implementation;
    }
}
