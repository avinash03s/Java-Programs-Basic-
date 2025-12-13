package ExceptionHandling;

public class StackTraceExample {

    public static void main(String[] args) {
        System.out.println("StackTraceExample.main");
        a();
    }

   static void a(){
        System.out.println("StackTraceExample.a");
        b();
    }
   static void b(){
        System.out.println("StackTraceExample.b");
        c();
    }
    static void c(){
        try {
            int result=10/0;
            System.out.println(result);
        }catch (Exception e){
            System.out.println("StackTraceExample.c");
            e.printStackTrace();
        }
    }
}
