package Inheritance;

//Multilevel Inheritance

public class Vehicle {
    void start(){
        System.out.println("Vehicle is started...");
    }

    void stop(){
        System.out.println("Vehicle is stop....");
    }
}
class Car extends Vehicle{
    void honk(){
        System.out.println("Car is pip...");
    }

}
class ElectricCar extends Car{
    void chargeBattery(){
        System.out.println("Battery is fully charged....");
    }

    public static void main(String[] args) {
        ElectricCar ob= new ElectricCar();
        ob.start();
        ob.stop();
        ob.honk();
        ob.chargeBattery();
    }
}