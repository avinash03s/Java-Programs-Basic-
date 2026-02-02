package Array;

class Class {

    void show() {
        System.out.println("Outer Class method");
        InnerClass ob = new InnerClass();
        ob.run();
    }

    public static class InnerClass {
        void run() {
            System.out.println("Inner class method");
        }
    }
}

class Main extends Array.Class {
    public static void main(String[] args) {
        Class ob = new Class();
        ob.show();

    }
}
