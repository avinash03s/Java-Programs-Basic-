package Multithreading;
class Resource1{
    String name;
     Resource1(String name){
         this.name=name;
     }
}
public class SolveDeadLock2Way {

    public static void main(String[] args) {
        Resource1 obj1= new Resource1("Pen");
        Resource1 obj2= new Resource1("Paper");

        Thread t1= new Thread(() -> {
            synchronized (obj1){
                synchronized (obj2){
                    System.out.println("Thread-1 locked Pen & Paper");
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (obj1){
                synchronized (obj2){
                    System.out.println("Thread-2 locked Pen & Paper");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
