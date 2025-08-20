//**No return type method.**


//Why method create?
//==> For performing action using method.

package JavaBprogran;

// 1st Syntax

public class Method {
    void get(){
        System.out.println("Hello");// for learning
    }
    void set(){
        System.out.println("World");
    }

   //2nd Syntax

    void meet(int x,float y, String z){
        System.out.println("This is parameter type");
    }

    //3rd syntax
    int wet(){
        return 45;
    }

    //4th syntax

    int addition(int a,int b){
        int c= a+b;
        return (23+4);
    }
    public static void main(String[] args) {
        Method ob= new Method();
        ob.get();
        ob.set();
        ob.meet(10,45-0, "Avinash");
    }
}
