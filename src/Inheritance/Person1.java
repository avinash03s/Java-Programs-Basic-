package Inheritance;

public class Person1 {
    void sleep1(){
        System.out.println("sleep mode on...");
    }
}
class Employee extends Person1 {
    void work() {
        System.out.println("Employee work on Java..");
    }
}
class Manager extends Employee{
    void conductMeeting(){
        System.out.println("Manager present in meeting");
    }

    public static void main(String[] args) {
        Manager ob= new Manager();
        ob.sleep1();
        ob.work();
        ob.conductMeeting();
    }
}