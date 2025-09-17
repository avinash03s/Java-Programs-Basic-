package Interfaces;

public interface InterfaceRule5 {
    void play();
    void give();
}
interface Rule5 extends InterfaceRule5{
    @Override
    void play();

    @Override
    void give();
}
class Normal implements InterfaceRule5,Rule5{
    @Override
    public void play() {
        System.out.println("Interface method are override");
    }

    @Override
    public void give() {
        System.out.println("Second method are override");
    }

    public static void main(String[] args) {
        Normal ob= new Normal();
        ob.play();
        ob.give();
    }
}
/*
* if non-abstract class implements interface then mandatory to override method of
* interface, in these non-abstract class; */