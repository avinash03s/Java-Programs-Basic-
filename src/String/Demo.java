package String;

//intern() method
// using heap object reference, if we want to get corresponding SCP object

public class Demo {
    public static void main(String[] args) {
        String s1= new String("Avi");
        String s2=s1.intern();
        System.out.println(s1==s2);//false
        String s3="Avi";
        String s4=s3.intern();
        System.out.println(s2==s3);//true
        System.out.println(s3==s4);
    }
}
