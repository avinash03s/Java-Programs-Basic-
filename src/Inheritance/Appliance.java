package Inheritance;

public class Appliance {
    void turnOn(){
        System.out.println("Turn on Appliance..");
    }
}
class WashingMachine extends Appliance{
    void washClothes(){
        System.out.println("Washing cloth..");
    }

}
class SmartWashingMachine extends WashingMachine {
    void connectWiFi(){
        System.out.println("Wi-Fi Connected..");
    }

    public static void main(String[] args) {
        SmartWashingMachine ob= new SmartWashingMachine();
        ob.turnOn();
        ob.washClothes();
        ob.connectWiFi();
    }
}
