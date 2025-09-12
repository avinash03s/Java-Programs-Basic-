package Inheritance;

//Multilevel Inheritance

public class Device {
    void powerOn(){
        System.out.println("Device is started....");
    }
}
class Computer extends Device{
    void runProgram(){
        System.out.println("Program is running.....");
    }
}
class Laptop extends Computer{
    void fold(){
        System.out.println("Folded.....");
    }

    public static void main(String[] args) {
        Laptop ob= new Laptop();
        ob.powerOn();
        ob.runProgram();
        ob.fold();
    }
}
