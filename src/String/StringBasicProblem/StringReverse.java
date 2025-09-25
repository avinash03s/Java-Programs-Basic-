package String.StringBasicProblem;

public class StringReverse {
    public static void main(String[] args) {
        String s="Avinash";
        String tem="";
        for (int i=s.length()-1;i>=0;i--){
            tem+=s.charAt(i);
        }
        System.out.println(tem);
    }
}

//convert char[] to String

class ABCD{
    public static void main(String[] args) {
        char[]arr={'A','v','i','n','a','s','h'};
        System.out.println(arr);
    }
}
