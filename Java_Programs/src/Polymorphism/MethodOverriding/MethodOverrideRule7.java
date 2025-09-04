package Polymorphism.MethodOverriding;

//private method cannot be inherit that reason private method are not override;

public class MethodOverrideRule7 {
    private void bankPin(){
        System.out.println("Private method ");
    }
}
class Rule7 extends MethodOverrideRule7{
    private void bankPin(){
        //super.bankPin();

    }

    public static void main(String[] args) {
        //MethodOverrideRule7 ob=new MethodOverrideRule7();
        //ob.bankPin();
    }
}
