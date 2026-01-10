package Array;

public class ReverseCharArray {

    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};

//        for (int i = ch.length-1; i >= 0; i--){
//            System.out.println(ch[i]);
//        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println("------------------------");
        for (int i = 0; i < ch.length/2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length-i-1];
            ch[ch.length-i-1] = temp;
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }


    }
}
