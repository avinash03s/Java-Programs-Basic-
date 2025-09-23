package String.StringBasicProblem;

public class AnotherReverseString {
    public static void main(String[] args) {
        String s= "Avinash";
        String tem="";
        for (int i=s.length()-1;i>=0;i--){
            tem=tem+s.charAt(i);
        }
        System.out.println(tem);
    }
}
