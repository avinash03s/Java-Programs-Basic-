package Java_8_feature;

public class Student {

    public static void main(String[] args) {
        Runnable runnable = ()->{
            for (int i = 0; i < 10; i++){
                System.out.println("Hello");
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();

    }
}
