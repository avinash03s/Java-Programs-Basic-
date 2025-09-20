package Abstraction;


abstract class Default{
    int a=10;

}
class DefaultConstructor extends Default{
    int a=10;

}
public class AbsDefaultConstructor{
    public static void main(String[] args) {
        DefaultConstructor ob= new DefaultConstructor();
        System.out.println(ob.a);
    }
}
