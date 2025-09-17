package Polymorphism.Casting;

//down casting;

public class DownCasting {
    void sum(){
        System.out.println("DownCasting.sum");
    }
    void run(){
        System.out.println("DownCasting.run");
    }
}
class ChildCasting extends DownCasting{
    public static void main(String[] args) {
        ChildCasting ob=(ChildCasting)new DownCasting();
        ob.sum();
        ob.run();
    }
}
