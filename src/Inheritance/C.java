package Inheritance;

class A{
    String s= "Class A";
}
class B extends A{
    String s="Class B";
    {
        System.out.println(super.s);
    }
}
public class C extends B {
    String s="Class C";
    {
        System.out.println(super.s);
    }

}
class MainClass{
    public static void main(String[] args) {
        C ob= new C();
        System.out.println(ob.s);

    }
}
