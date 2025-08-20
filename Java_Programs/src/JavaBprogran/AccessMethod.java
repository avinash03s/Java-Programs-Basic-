package JavaBprogran;
// Method Calling
public class AccessMethod {
    int age = 20;
    String name ="Avi";

    int meet(int a, int b){ /// Paramiterized method(arg)
        int c= a+b;
        System.out.println(c);
        return 0;

    }

    void neet(){
        System.out.println("Normal method");
    }//normal method

    public static void main(String[] args) {
         AccessMethod ob = new AccessMethod();
        System.out.println("Access to age "+ob.age);
        System.out.println("Access main "+ob.name);
        ob.neet();
        ob.meet(40,5);

    }

}
