package java_17_feature;


/// this is sealed class
sealed class Parent permits Child1,Child2{
    void parentProperty(){
        System.out.println("This is Parent...");
    }
}
final class Child1 extends Parent{
    void child(){
        System.out.println("This is child1...");
    }

}

final class Child2 extends Parent{
    void child2(){
        System.out.println("This is child2...");
    }
}

/// compile time error
//class Child3 extends Parent{
//    void child3(){
//        System.out.println("this is Child3 not permit");
//    }
//}
public class SealedClasses {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.parentProperty();
        Child1 child1 = new Child1();
        child1.child();
        Child2 child2 = new Child2();
        child2.child2();
    }
}
