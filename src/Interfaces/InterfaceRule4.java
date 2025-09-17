package Interfaces;

public interface InterfaceRule4 {
    void run();
    void show();
}
interface Rule4 extends InterfaceRule4{
    void add();
    void mul();
}
abstract class Bank implements InterfaceRule4,Rule4{

}

//if abstract class implements one or more interfaces then not mandatory to override these method;
