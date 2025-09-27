package Inheritance;

interface ABCD{
    default void give(){
        System.out.println("ABCD.give");
    }
}
interface EFGH{
    default void give(){
        System.out.println("EFGH.give");
    }
}
class Main implements ABCD,EFGH{
    @Override
    public void give() {
        EFGH.super.give();
        System.out.println("AmubitySolve.give");
    }
}
public class AmubitySolve {
    public static void main(String[] args) {
        Main ob= new Main();
    }
}