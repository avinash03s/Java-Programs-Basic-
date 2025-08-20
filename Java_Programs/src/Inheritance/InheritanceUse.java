package Inheritance;

class Parent{
    void add(){
        System.out.println("Parent class add method");
    }
}


public class InheritanceUse extends Parent{

    public static void main(String[] args) {
        Parent ob=new Parent();
        ob.add();

        InheritanceUse ob1= new InheritanceUse();
        ob1.add();
    }
}
