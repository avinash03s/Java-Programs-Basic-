package Inheritance;

class Vehicle12{
    int a;
    String name;

    Vehicle12(int a,String name){
        this.a=a;
        this.name=name;
        System.out.println(a+" " +name);
    }

    void display(){
        System.out.println("Vehicle12.display");
    }
}
public class HasACar {
    Vehicle12 ob= new Vehicle12(45,"Avinash");
    void show(){
        ob.display();
    }

}
class Normal{
    public static void main(String[] args) {
        HasACar ob1= new HasACar();
        ob1.show();

    }
}
