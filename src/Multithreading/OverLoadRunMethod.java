package Multithreading;

public class OverLoadRunMethod extends Thread{

    @Override
    public void run() {
        System.out.println("no-arg run method");
    }

    public void run(int a){
        System.err.println("int arg run method");
    }
}
class StartThread{
    public static void main(String[] args) {
        OverLoadRunMethod ob= new OverLoadRunMethod();
        ob.start();
    }
}
