package JavaBprogran;

public class MoreMethodCalling {
    float main(float a,float b){
        float c= a+b;
        System.out.println("It is float/int return method");
        return 0;
    }

    void set(double x ,boolean y){
        System.out.println("Normal but Parameterised");
    }

    public static void main(String[] args) {
        MoreMethodCalling ob= new MoreMethodCalling();
        ob.main(40.0F,45.0f);
        ob.set(557477.0, true);
    }
}
