package Multithreading;

public interface AnonymousInterface {
    void add(int a, int b);
    void displayName(String name);
}

class Example {
    public static void main(String[] args) {
        AnonymousInterface ob = new AnonymousInterface() {
            @Override
            public void add(int a, int b) {
                int result = a + b;
                System.out.println(result);
            }

            @Override
            public void displayName(String name) {
                System.out.println(name);
            }
        };

        ob.add(10,20);
        ob.displayName("Addtion");
    }
}
