package String.StringMethod;

public class EqualsMethod {
    public static void main(String[] args) {
        String s= "Java";
        String s1="Java";
        System.out.println(s.equals(s1));
        System.out.println(s==s1);//true
        //true

        String s2="Avi";
        String s3=new String("Avi");
        System.out.println(s2.equals(s3));//true


        /*== operator used to reference comparison
        * and .equals() method used to contain comparison;*/
    }
}
