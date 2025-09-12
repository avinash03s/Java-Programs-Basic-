package Polymorphism.MethodOverriding;

/*final method cannot be override*/

public class MethodOverridingRule5 {
    final void play(){
        System.out.println("Final method cannot be override");
    }

}
class Rule5 extends MethodOverridingRule5{
   /* final void play(){
        System.out.println("Final method cannot be override");
    }*/

}
