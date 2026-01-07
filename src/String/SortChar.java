package String;

public class SortChar {

    public static void main(String[] args) {
        String s = "c,d,a,b";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            for (int j = 1; j < chars.length; j++){
                char tem = chars[i];
                chars[i] = chars[j];
                chars[j] = tem;
            }
        }
        System.out.println(chars);
    }
}
