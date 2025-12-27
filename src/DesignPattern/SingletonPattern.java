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

    void getConnection(){
        System.out.println("You are now connected to the database.");
    }

}

class Main {

    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getSingletonPattern();
        singletonPattern.getConnection();

//        SingletonPattern singletonPattern1 = SingletonPattern.getSingletonPattern();
//
//        if (singletonPattern.hashCode() == singletonPattern1.hashCode()) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
    }
}
