package Inheritance;

public class Sport {
    void play1(){
        System.out.println("I play cricket..");
    }
}
class OutdoorSport extends Sport{
    void run(){
        System.out.println("Running ");
    }
}
class Cricket extends OutdoorSport{
    void batting(){
        System.out.println("I need one run for Fifty");
    }

    public static void main(String[] args) {
        Cricket ob= new Cricket();
        ob.play1();
        ob.run();
        ob.batting();
    }
}
