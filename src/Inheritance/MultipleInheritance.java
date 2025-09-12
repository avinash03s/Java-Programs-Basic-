package Inheritance;

//Java does not support multiple inheritance
/*one child class not access one more parent class property */
//this is abiguity


class Parent1{
    void set(){
        System.out.println("hi i am parent of Multiple In");
    }
}
class Parent2 extends Parent1{
    void meet(){
        System.out.println("Hi i am 2nd parent of Multiple in");
    }
}
/*
class Child1 extends Parent2,Parent1{
    void get(){
        System.out.println("hiii");
    }
}
*/


public class MultipleInheritance {
}
