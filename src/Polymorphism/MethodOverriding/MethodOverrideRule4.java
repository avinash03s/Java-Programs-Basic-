package Polymorphism.MethodOverriding;


/*The access level cannot be more restrictive than the parent
* class method's access level
* For example:- if the super class method is declared public
* ,then the over-riding method in the subclass cannot be either
* (smaller) private or default or protected */

import JavaBprogran.Method45;

public class MethodOverrideRule4 {
    public void taken(){
        System.out.println("This is public access modifires method");

    }

    void give(){
        System.out.println("default access method");
    }

}
class Rule4 extends MethodOverrideRule4{
    @Override
    public void taken() {
        super.taken();
        System.out.println("public method access modi. on public not any");
    }

    @Override
   void give() {
        super.give();//use super keyword to call parent class method.
        System.out.println("Default method access only big accesser than default");
    }

    public static void main(String[] args) {
        Rule4 ob= new Rule4();
        ob.taken();
        ob.give();
    }
}
