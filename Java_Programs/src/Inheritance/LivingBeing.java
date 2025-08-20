package Inheritance;

//Multilevel Inheritance

public class LivingBeing {
    void breathing(){
        System.out.println("Breathing.....");
    }
    void eating(){
        System.out.println("Eating...");
    }
}
class Animal extends LivingBeing{
    void walking(){
        System.out.println("Walking...");

    }

    void making(){
        System.out.println("Sound Making.....");

    }
}
class Dog extends Animal{
    void barking(){
        System.out.println("Dog is barking...");
    }

    void wagging(){
        System.out.println("wagging....");
    }

    public static void main(String[] args) {
        Dog ob= new Dog();
        ob.breathing();
        ob.eating();
        ob.walking();
        ob.making();
        ob.barking();
        ob.wagging();
    }
}
