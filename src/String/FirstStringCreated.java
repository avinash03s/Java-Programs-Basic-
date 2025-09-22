package String;

public class FirstStringCreated{
    public static void main(String[] args) {
        /*String s="Avinash";  // String Literal
        String s1=new String("Java");//  using new Keyword;
        String s2="Surwase";
        String s4= new String("Avinash");
        String s5="Avinash";
        String s6= new String("Avinash");*/
        String s7="Surwase";
        String s=new String("Surwase");
        String s1= new String("Surwase");
        String s8="Surwase";
        System.out.println(s7==s8);//true(reference comp);
        System.out.println(s.equals(s1));//true(contain comp);



       /* System.out.println(s == s1); //false
        System.out.println(s==s2);  //false
        System.out.println(s==s4);  //false
        System.out.println(s==s5);  //true
        System.out.println(s==s6);  //true
        System.out.println(s==s7);*/

        /*System.out.println(s.equals(s1)); //false
        System.out.println(s.equals(s2)); //false
        System.out.println(s.equals(s4)); //true
        System.out.println(s.equals(s5)); //true*/
    }
}
