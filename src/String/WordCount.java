package String;

public class WordCount {

    public static void main(String[] args) {
        String s = "Avinash";
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            count++;
        }
        System.out.println("Word Count: "+count);
    }
}
