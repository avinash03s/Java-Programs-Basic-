package String;

public class Hello {

    public static void main(String[] args) {
        String s = "Hello";
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.println("Even : " + i);
            } else {
                System.out.println("Odd : " + i);
            }

        }
    }
}

class OddEvenString{

    public static void main(String[] args) {
        String s1 = "Hello";
        for (int i = 0; i < s1.length(); i++){
            char s2 = s1.charAt(i);
            int ascii = (int) s2;
            if (ascii % 2 ==0){
                System.out.println("Even : "+ascii);
            }else {
                System.out.println("Odd : "+ascii);
            }
        }
    }
}
