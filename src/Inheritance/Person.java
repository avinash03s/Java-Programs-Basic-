package Inheritance;

public class Person {
    void speak(){
        System.out.println("Hello...");
    }
    void walk(){
        System.out.println("Yes we go for village..");
    }
}
class Student extends Person{
    void study(){
        System.out.println("Yes i study java..");
    }

}
class CollegeStudent extends Student{
    void doInternship(){
        System.out.println("Yes I got Internship in ..... company");
    }

    public static void main(String[] args) {
        CollegeStudent ob= new CollegeStudent();
        ob.speak();
        ob.walk();
        ob.study();
        ob.doInternship();
    }

}
