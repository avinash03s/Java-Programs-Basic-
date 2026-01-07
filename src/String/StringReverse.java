package String;

public class StringReverse {

    public static void main(String[] args) {
        String s = "Hello Java";
        String s1 = "";
        for (int i = s.length()-1; i >= 0; i--){
            s1 += s.charAt(i);
        }
        System.out.println(s1);
    }
}
