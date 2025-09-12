package Polymorphism.MethodOverriding;

/*The return type should be the same or a subtype of the
* return type declared in the original overridden method in the
* super class ==> Covariant return types-Objects*/

public class MethodOverrideRule3Object {
    MethodOverrideRule3Object sum(){
        System.out.println("....");
        return new MethodOverrideRule3Object();
    }

}
class Rule3Child extends MethodOverrideRule3Object{
    @Override
    Rule3Child sum(){
        super.sum();
        System.out.println("..................");
        return new Rule3Child();
    }

    public static void main(String[] args) {
        Rule3Child ob= new Rule3Child();
        ob.sum();
    }

}
