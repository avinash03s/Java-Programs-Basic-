package Polymorphism.MethodOverriding;

/*A subclass in a different package can only override the
non-final methods declared public or protected.
 */

import Polymorphism.MethodOverloading.SuperOverridingRule;

public class MethodOverrideRule9 extends SuperOverridingRule {

    @Override
    public void meet() {
        super.meet();
        System.out.println("public method are override in different package");
    }

    @Override
    protected void get() {
        super.get();
        System.out.println("protected method are override in different package ");
    }

    public static void main(String[] args) {
        MethodOverrideRule9 ob= new MethodOverrideRule9();
        ob.meet();
        ob.get();
    }
}

