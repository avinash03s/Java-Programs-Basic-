package Constructor;
class Parent{

}
public class IntroThisKeyword {
    IntroThisKeyword(){
        this(30);
        System.out.println("no-arg const");
    }
    IntroThisKeyword(int a){
        System.out.println("1 arg");
    }
    IntroThisKeyword(int b, String c){
        this();
        System.out.println("2 arg");
    }

    public static void main(String[] args) {
        IntroThisKeyword ob=new IntroThisKeyword(40,"Java");
    }
}
