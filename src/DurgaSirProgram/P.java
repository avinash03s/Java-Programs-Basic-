package DurgaSirProgram;

public class P {
    void property(){
        System.out.println("cash,land");
    }
    final void marry(){
        System.out.println("xyz");
    }
}
class c extends P{
   /* @Override
    void marry() {
        //super.marry();
        System.out.println("abc");
    }
*/
    public static void main(String[] args) {
        c ob= new c();
        ob.marry();
        ob.property();
    }
}
