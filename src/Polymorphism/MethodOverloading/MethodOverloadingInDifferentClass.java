package Polymorphism.MethodOverloading;

public class MethodOverloadingInDifferentClass {
   /* void over(){
        System.out.println("6 ball in 1 over");
    }*/
    void display(){
        System.out.println("Match started in big screen");
    }
}
class B extends MethodOverloadingInDifferentClass{
    /*@Override
    void over() {
        System.out.println("In cricket pull shot is my favourite");
    }
    void over(int a){
        super.over();
        System.out.println("Avi45");
    }*/
    void display(int a){
       // super.display();
        System.out.println("yes");
    }


}
class AtoZ {
    public static void main(String[] args) {
        /*B ob= new B();
        ob.over();
        ob.over(33);*/

        B ob= new B();
        ob.display();
        ob.display(3);
    }
}
