package Abstraction;

/*Create an abstract class Animal with a method makeSound(). Then, create
 two animal classes (Dog and Cat) that extend Animal and implement their own sounds*/

abstract class Main {
        abstract void makesound();


}
class Dog extends Main{
    void makesound(){
        System.out.println("hello");
    }
}
class Cat extends Main{
    void makesound(){
        System.out.println("HI");
    }
}
class Animal{
    public static void main(String[] args) {
        Dog ob=new Dog();
        Cat ob1=new Cat();
        ob.makesound();
        ob1.makesound();
    }
}
