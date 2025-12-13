package Casting_Object;

public class DownCasting {

    void show(){
        System.out.println("Parent Class Method");
    }
}
class DownCastingChild extends DownCasting{
    @Override
    void show(){
        System.err.println("Child class Method");
    }
}

class MainClass{

    public static void main(String[] args) {
        //upcasting
        DownCasting ob1= new DownCastingChild();

        //downCasting
        DownCastingChild ob= (DownCastingChild) ob1;
        ob.show();
    }

}
