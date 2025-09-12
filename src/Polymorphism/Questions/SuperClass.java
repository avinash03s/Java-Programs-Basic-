package Polymorphism.Questions;

public class SuperClass {
    void superClassMethod(Number n){
        System.out.println("From super class");
    }
}
class SubClass extends SuperClass{
    void superClassMethod(double d){
        System.out.println("From sub class");
    }
}
class MainClass{
    public static void main(String[] args) {
        SuperClass ob= new SubClass();
        ob.superClassMethod(123321);
    }
}

/*OUTPUT: print Number=123321;
* because we're using parent class reference to create
* object and create object of sub class(child class)
* for this reason using object reference call parent method;*/
