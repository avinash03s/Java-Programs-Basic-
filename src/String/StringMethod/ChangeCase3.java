package String.StringMethod;

import java.util.Locale;


public class ChangeCase3 {
    public static void main(String[] args) {
        String s=new String("I LIKE IT JAVA");
        System.out.println(s);

        Locale turkish=Locale.forLanguageTag("tr");
        Locale english= Locale.forLanguageTag("en");

        String sT=s.toLowerCase(turkish);
        String sE=s.toLowerCase(english);

        System.out.println("Turkish Lang: "+sT);
        System.out.println("English Lang: "+sE);
    }
}
