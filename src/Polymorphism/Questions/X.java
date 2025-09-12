package Polymorphism.Questions;

public class X {
    int method(int i){
        return i*=i;
    }
}
class Y extends X{
    double method(double d){
        return d/=d;
    }
}
class Z extends Y{
    float method(float f){
        return f+=f;
    }
}
class ClassMain{
    public static void main(String[] args) {
        Z ob= new Z();
        System.out.println(ob.method(21.12));
    }
}
