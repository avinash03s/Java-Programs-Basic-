
class One {
    int add(float a, float b) {
        return (int) (a + b);
    }
}
class Two extends One {
    int sub (int a, int b){
        return a - b;
    }
}

public class DataTypeCasting {
    public static void main(String[] args) {
//        int a = 10;
//        float b = a;   //widening auto(Smaller Data type to longer)
//        System.out.println(b);
//
//        float x = 10.0f;
//        int y = (int)x; //narrowing not auto (longer data type to smaller)
//        System.out.println(y); // loss data

        int a = 100;
        double b = a;
        System.out.println(b);

        double c = 100.0;
        int d = (int) c;
        System.out.println("Loss data: " + d);

        One ob = new Two();
        Two ob1 = (Two) ob;
        System.out.println(ob1.add(40.0f,5.0f));
    }
}