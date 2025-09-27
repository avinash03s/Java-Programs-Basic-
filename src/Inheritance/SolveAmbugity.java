package Inheritance;
interface Solve{
    void show();
}
interface Ambugity extends Solve{
    void show();
}
public class SolveAmbugity implements Solve,Ambugity {
    @Override
    public void show() {
        System.out.println("SolveAmbugity.show");
    }

   /* @Override
    public void take() {
        System.out.println("SolveAmbugity.take");
    }*/

    public static void main(String[] args) {
        SolveAmbugity ob=new SolveAmbugity();
        ob.show();
        //ob.take();
    }
}
