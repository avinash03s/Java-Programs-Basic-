package Polymorphism.MethodOverriding;

/*within same package subclass(child class) override super class(parent)
* but any method declare as private,final,static that methods cannot be overridden */

/*within the same package only access method are 1)public 2) protect 3)default
* 1)public 2) protect 3)default==> these method are override in same package between parent and child; */

public class MethodOverrideRule8 {
    void running(){
        System.out.println("running fast");
    }

    public void play(){
        System.out.println("playing cricket..");
    }

    protected void work(){//
        System.out.println("working in.... company as Java developer");
    }

    private void add1(){
        System.out.println("private method");
    }

    final void display(){
        System.out.println("final method");
    }
    static void taken(){
        System.out.println("static method");
    }


}
class Rule8 extends MethodOverrideRule8{
    @Override
    void running() {
        System.out.println("Default method");
    }

    @Override
    public void play() {
        System.out.println("Public method");
    }

    @Override
    protected void work() {
        System.out.println("Protected method ");
    }

  /*  private void add1(){
        System.out.println("Private method");
    }

    final void display(){
        System.out.println("final method");
    }*/

    static void taken(){
        System.out.println("Static re-declare method");
    }



}
class ABCD{
    public static void main(String[] args) {
        Rule8 ob= new Rule8();
        ob.running();
        ob.play();
        ob.work();
        //ob.add1();
        ob.display();
        Rule8.taken();

    }
}
