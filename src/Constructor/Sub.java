package Constructor;
class Super{
    Super(){
        this(23,true);
        System.out.println("Parent-no arg"); //2
    }
    Super(int a,boolean b){
        System.out.println("Parent. 2 arg "); //1
    }
}
public class Sub extends Super {
    Sub(){
        System.out.println("Child-no arg "); //3
    }
    Sub(int a){
        this();
        System.out.println("child- 1 arg"); //4
    }

    public static void main(String[] args) {
        Sub ob= new Sub(2);
    }
}
