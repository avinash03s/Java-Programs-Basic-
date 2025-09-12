package Polymorphism.MethodOverloading;

public class MethodOverloadingRule {
    private void run(){
//        System.out.println("this is private method");
        System.out.println("MethodOverloadingRule.run | private without param");
    }

    public void run(int a){
//        System.out.println("overloaded method");
        System.out.println("MethodOverloadingRule.run | a = "+a);
    }


   protected static void play(){
        System.out.println("play cricket");
    }

    private static void play(int a){
//        System.out.println("This is static method with parameter "+a);
        System.out.println("MethodOverloadingRule.play | a = "+a);
    }

    public static void main(String[] args) {

        MethodOverloadingRule obj = new MethodOverloadingRule();
        obj.run();
        obj.run(11);
        MethodOverloadingRule.play(22);
    }

}
