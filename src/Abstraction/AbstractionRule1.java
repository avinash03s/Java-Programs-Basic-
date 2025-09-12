package Abstraction;

/*RuleNo1:  It's not mandatory to have abstract method in abstract class.*/

abstract class AbstractionRule1 {
    void add(){
        System.out.println(); //   non-abstract method or concreate method;
    }

    //abstract void add(int a);  // abstract arg method ;

}
class Rule1 extends AbstractionRule1{



}
