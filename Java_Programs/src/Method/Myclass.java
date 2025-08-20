package Method;

public class Myclass {
    void sum(){  // this is void method  and his does not return any value.
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
    int max(int a){  //this is return type method.
        return 50;

    }

    public static void main(String[] args) {
        Myclass ob=new Myclass();    //Myclass() is method used to initalise object.
        ob.sum();
        System.out.println(ob.max(50));
    }
}
