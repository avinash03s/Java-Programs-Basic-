package DesignPattern;


public class SingletonPattern {

    //private static variable
    private static SingletonPattern singletonPattern;

    //constructor
    private SingletonPattern() {

    }

    //static method
    //lazy way of creating object
    public static SingletonPattern getSingletonPattern() {

        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}

class Main {

    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getSingletonPattern();
        System.out.println(singletonPattern.hashCode());

        SingletonPattern singletonPattern1 = SingletonPattern.getSingletonPattern();
        System.out.println(singletonPattern1.hashCode());

        if (singletonPattern.hashCode() == singletonPattern1.hashCode()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
