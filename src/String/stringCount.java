package String;

public class stringCount {

    public static void main(String[] args) {
        String s = "Java,is,a,high,level,programing,lang";
        String[] strings = s.split(",");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
            count++;
        }
        System.out.println(count);
    }
}
