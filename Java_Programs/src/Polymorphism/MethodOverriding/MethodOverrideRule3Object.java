package Polymorphism.MethodOverriding;

/*The return type should be the same or a subtype of the
* return type declared in the original overridden method in the
* super class ==> Covariant return types-Objects*/

public class MethodOverrideRule3Object {
    String sum(){
        System.out.println("....");
        return "Avi";
    }

}
class Rule3Child extends MethodOverrideRule3Object{


}
