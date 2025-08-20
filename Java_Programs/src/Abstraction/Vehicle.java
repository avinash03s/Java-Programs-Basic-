package Abstraction;

public class Vehicle {
    void start(){
        System.out.println("Vehicle is started");
    }
}
class Car1 extends Vehicle{
    @Override
    void start() {
        super.start();
        System.out.println("Car is started");
    }
}
class Bike1 extends Vehicle{
    @Override
    void start() {
        super.start();
        System.out.println("Bike is started");
    }

    public static void main(String[] args) {

        Vehicle ob= new Vehicle();
        ob.start();

        Car1 ob1=new Car1();
        ob1.start();

        Bike1 ob2= new Bike1();
        ob2.start();
    }
}
