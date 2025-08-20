package Inheritance;

public class Animal1 {
    void getting(){
        System.out.println("hi");
    }
}
class Bird extends Animal1{
    void fly(){
        System.out.println("Bird are flying....");
    }
}
class Parrot extends Bird{
    void talk(){
        System.out.println("Parrot spek like man..");
    }

    public static void main(String[] args) {
        Parrot ob= new Parrot();
        ob.getting();
        ob.fly();
        ob.talk();
    }
}
