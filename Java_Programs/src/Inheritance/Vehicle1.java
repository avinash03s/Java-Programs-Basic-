package Inheritance;

public class Vehicle1 {
    String name;

    Vehicle1(int prize){
        System.out.println("prize: "+prize);
    }

    public Vehicle1() {
    }



}
class Car1 extends Vehicle1{

    void airCondition(){
        System.out.println("AC ");
    }

}
class Bike extends Vehicle1{
    void kickStart(){
        System.out.println("Bike Started...");
    }
}
class Truck extends Vehicle1{

    void loadCapacity(){
        System.out.println("High load capacity..");
    }

    public static void main(String[] args) {
        Truck ob= new Truck();
        ob.name="TATA";

    }
}
