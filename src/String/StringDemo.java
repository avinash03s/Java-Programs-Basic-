package String;

public class StringDemo {
    public static void main(String[] args) {
        String s1=new String("Avi");
        String s2= new String("Avi");
        System.out.println(s1==s2);     //reference comparison(output:false);
        System.out.println(s1.equals(s2)); //content comparison(Output:true);
        System.out.println("..............................");
        String s3="Java";
        String s4="Java";
        System.out.println(s3==s4);//reference comparison(output:true);
        System.out.println(s3.equals(s4));//content comparison(output:true);
    }
}
