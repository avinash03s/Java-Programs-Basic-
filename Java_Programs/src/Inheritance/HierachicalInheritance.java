package Inheritance;

//Hierachical Inheritance

/*In this Hierachical inheritance one parent class and two child class,
* means child1 access property of parent and child2 access same parent property*/

class HParent{
    void ask(){
        System.out.println("I am parent");
    }
}
class HChild1 extends HParent{
    void set(){
        System.out.println("I am child of hierachical inheritance");
    }
}
class HChild2 extends HParent{
    void meet(){
        System.out.println("i am 2nd Child of Hierachical Inheritance");
    }
}

public class HierachicalInheritance {
    public static void main(String[] args) {
        HChild2 ob = new HChild2();
        ob.ask();
        ob.meet();

        HChild1 ob1 = new HChild1();
        ob1.ask();
        ob1.set();


    }
}
