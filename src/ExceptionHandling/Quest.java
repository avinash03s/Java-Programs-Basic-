package ExceptionHandling;

public class Quest {

    public static void main(String[] args) {
        try {
            System.out.println("Java");
            System.exit(0);
        }finally {
            System.out.println("Finally");
        }
    }
}

class _2Ques{

    public static void main(String[] args) {
        try {
            System.out.println(100);
        } catch (RuntimeException e) {
            System.exit(0);
        }finally {
            System.out.println("Finally..");
        }
    }
}

class _3Ques{

    int m1(){
        try {
            System.out.println(10);
        } catch (Exception e) {
            System.out.println(20);
        }finally {
            return 30;
        }
    }



    public static void main(String[] args) {
        _3Ques ob = new _3Ques();
        ob.m1();
    }
}
