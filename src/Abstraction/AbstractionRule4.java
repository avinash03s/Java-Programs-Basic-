package Abstraction;

/* If one abstract class extends another abstract class,
then it's not mandatory for that child class to provide method implementations of abstract methods of super class
*/


abstract class AbstractionRule4 {

    abstract void show();

}
abstract class Rule4 extends AbstractionRule4{

    //No need implement abstract method of parent class;

}