package Inheritance;

public class A1 {
    void show(){
        System.out.println("hi");
    }
}
class B1 extends A1{
    @Override
    void show() {
        super.show();
    }

    public static void main(String[] args) {
        B1 ob = new B1();
        ob.show();
    }
}


