package Abstraction;

/*1)Create an abstract class called Shape with:
An abstract method calculateArea().
A constructor that prints "Shape created".

2)Create concrete classes Circle, Rectangle, and Triangle that:
Extend Shape.
Provide implementation for calculateArea() using appropriate formulas.
Use some fixed values (e.g., radius = 5, length = 10, etc.) for simplicity.

3)In the main() method:
Create objects of Circle, Rectangle, and Triangle.
Call the calculateArea() method for each object.
*/


abstract class Shape {
    abstract void calculateArea();
    Shape(String a){
        System.out.println("Shape Created");
    }
}
class Circle extends Shape{

    Circle(String a) {
        super(a);
    }

    @Override
    void calculateArea() {
        double radius=5;
        System.out.println(Math.PI*radius*radius);
    }
}
class Rectangular extends Shape{

    Rectangular(String a) {
        super(a);
    }

    @Override
    void calculateArea() {
        double length=20*45;
        System.out.println(length);
    }
}
class Triangle extends Shape{
    @Override
    void calculateArea() {
        double area=0.5*5*6;
        System.out.println(area);
    }

    Triangle(String a){
        super(a);
    }

    public static void main(String[] args) {
        Triangle ob= new Triangle("Triangle");
        ob.calculateArea();

        Rectangular ob1= new Rectangular("Rectangular");
        ob1.calculateArea();

        Circle ob2= new Circle("Circle");
        ob.calculateArea();


    }
}
