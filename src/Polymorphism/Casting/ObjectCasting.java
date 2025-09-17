package Polymorphism.Casting;

//in upcasting use parent class reference and create object of child class;

public class ObjectCasting {
    void add(){
        System.out.println("Parent method");
    }

}
class Child extends ObjectCasting{
    @Override
    void add() {
        System.out.println("Child method");
    }

}
class Main{
    public static void main(String[] args) {
        ObjectCasting ob= new Child();
        ob.add();

        //Child ob1= (Child) new ObjectCasting();
    }
}
