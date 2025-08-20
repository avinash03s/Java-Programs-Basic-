package Abstraction;

//you not create ob of abstract class
abstract class ParentAbs{
    void rule() {
        System.out.println("hi");
    }
}
class Child extends ParentAbs {
    void child(){
        System.out.println("Hello");
    }

}
 public class Rule_3 {
     public static void main(String[] args) {
         Child ob=new Child();

     }
}




