package Polymorphism;

// This is method overload & override

class Cat{
    void run(String name){
        System.out.println("Cat run fast than mouse.");
    }

    void run(int a){
        System.out.println("2 method are overloaded ");
    }

    void show(int a,int b){
        int add=a+b;
        System.out.println("Cat c  lass sum of : "+add);
    }
}


public class Animal extends Cat {
    @Override
    void show(int a, int b) {
        int sub=a-b;
        System.out.println("Cat method is override in another class and sub of these class : "+sub);
    }
}
class Main {
    public static void main(String[] args) {
        Cat ob = new Cat();
        ob.run("Billa");
        ob.run(1);
        ob.show(2,2);

        Animal obj= new Animal();
        obj.show(10,6);


    }
}

