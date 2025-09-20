package Abstraction;

abstract class AbstractInnerClass {
    abstract void show();

    public static void main(String[] args) {
        AbstractInnerClass ob= new AbstractInnerClass() {
            @Override
            void show() {
                System.out.println("Hii");
            }
        };
        ob.show();
    }
}

