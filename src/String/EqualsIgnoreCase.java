package String;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String s="java";
        System.out.println(s.equals("JAVA"));//content comparison(case important)
        System.out.println(s.equalsIgnoreCase("JAVA"));//content comparison(Case is not important)
    }
}
