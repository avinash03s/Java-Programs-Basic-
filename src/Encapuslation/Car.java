package Encapuslation;

import Inheritance.C;

public class Car {
    private String driverName;
    private int carNumber;

    public void setDriverName(String driverName,int carNumber) {
        this.driverName = driverName;
        this.carNumber=carNumber;
    }

    /*public void setDriverName(String driverName) {
        this.driverName = driverName;
    }*/

   /* public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }*/

    public String getDriverName() {
        System.out.println("Driver Name is :"+driverName);
        return driverName;
    }

    public int getCarNumber() {
        System.out.println("Car Number is :"+carNumber);
        return carNumber;
    }
}
class Jeep extends Car{
    public static void main(String[] args) {
        Jeep ob = new Jeep();
        ob.setDriverName("Avinash",6097);
        ob.getDriverName();
        ob.getCarNumber();

    }

}
