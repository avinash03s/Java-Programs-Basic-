package String;

import java.util.Objects;

public class WordFrequency {

    public static void main(String[] args) {
        String s = "hi hi i i am am avinash avinash surwase i am java developer";
        String[] string = s.split(" ");
//        char[] ch = string.toCharArray();
        int count = 1;

        for (int i = 0; i < string.length; i++) {
            for (int j = 1; j < string.length; j++) {
                if (string[i].equals(string[j])) {
                    count++;
                }
            }
            System.out.println(string[i] + "---" + count);
            count = 0;
        }
    }
}
