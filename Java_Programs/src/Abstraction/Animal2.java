package Abstraction;

/*You have an abstract class Animal:
It should have an abstract method makeSound().
It should also have a constructor that prints "An animal is created".
Create the following subclasses:
Dog → prints "Dog barks" in makeSound().
Cat → prints "Cat meows" in makeSound().
Cow → prints "Cow moos" in makeSound().
In the main() method, create objects of each subclass and call makeSound()*/

abstract class Animal2 {

    Animal2(){
        System.out.println("An animal is created");
    }
    abstract void makeSound();
}
class Dog2 extends Animal2{
    Dog2(){
        super();
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat2 extends Animal2{
    Cat2(){
        super();
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
class Cow extends Animal2 {
    Cow() {
        super();
    }

    @Override
    void makeSound() {
        System.out.println("Cows moo");
    }


    public static void main(String[] args) {
        Dog2 ob = new Dog2();
        ob.makeSound();

        Cat2 ob1 = new Cat2();
        ob1.makeSound();


        Cow ob3 = new Cow();
        ob3.makeSound();
    }
}


