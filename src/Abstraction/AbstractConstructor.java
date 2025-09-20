package Abstraction;


abstract class Constructor{
    int a;
    Constructor(int a){
        this.a=a;
        System.out.println("Abstract constructor"+a);
    }
    abstract void run();
}

public class AbstractConstructor extends Constructor{

    AbstractConstructor(int a) {
        super(a);
        System.out.println("normal class child class constructor");
    }

    @Override
    void run() {
        System.out.println("///");
    }

    public static void main(String[] args) {
        AbstractConstructor ob= new AbstractConstructor(10);
        ob.run();
    }

}
