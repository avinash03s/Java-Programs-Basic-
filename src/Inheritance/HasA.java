package Inheritance;

class Rel{
    void run(){
        System.out.println("Rel.run");
    }
}
public class HasA {
    Rel ob= new Rel();
    void display(){
        ob.run();
        System.out.println("HasA.display");
    }

}
class MainMethod{
    public static void main(String[] args) {
        HasA ob1= new HasA();
        ob1.display();
    }
}
