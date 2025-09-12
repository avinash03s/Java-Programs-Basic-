package Inheritance;
class HyGrandP{
    void set(){
        System.out.println("I am HyGrandp");
    }
}
class HyParent extends HyGrandP{

    HyParent(){
        System.out.println("Hi i am const");
    }
    void meet(){
        System.out.println("I am HyParent");
    }
}
class HyChild1 extends HyParent{

}
class HyChild2 extends HyParent{

}
class HyChild3 extends HyParent{

}



public class HybridInheritance {
    public static void main(String[] args) {

        HyChild3 ob = new HyChild3();
        ob.set();
        ob.meet();
    }
}
