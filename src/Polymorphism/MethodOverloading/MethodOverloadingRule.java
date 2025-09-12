package Polymorphism.MethodOverloading;

public class MethodOverloadingRule {
    private void run(){
        System.out.println("this is private method");
    }

    public void run(int a){
        System.out.println("RUn overloaded method");
    }

   protected static void play(){
        System.out.println("play cricket");
    }

    private static void play(int a){
        System.out.println("....");
    }


}
