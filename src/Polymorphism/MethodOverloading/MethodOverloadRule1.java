package Polymorphism.MethodOverloading;

/*method are overloaded into same class */

public class MethodOverloadRule1 {
    void sum(){
        System.out.println("SUm of these number");
    }

    void sum(int a){
        System.out.println("..."+" "+a);
    }
    void sum(String a){
        System.out.println("Method overloaded"+" "+a);
    }
}
class M{
    public static void main(String[] args) {
        MethodOverloadRule1 ob= new MethodOverloadRule1();
        ob.sum();
        ob.sum(45);
        ob.sum("Avinash");
    }
}
