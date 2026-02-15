package java_10_feature;

public class Demo {

    int play(int a, int b){
        var c = a + b;
        System.out.println("var Keyword: " +c);
        return c;
    }
}
class Main{

    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.play(40,5);
        System.out.println("Hii......");
    }
}
