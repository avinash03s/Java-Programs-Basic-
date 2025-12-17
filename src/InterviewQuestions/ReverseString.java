package InterviewQuestions;


public class ReverseString {

    public static void main(String[] args) {

        //using StringBuffer;
        StringBuffer stringBuffer = new StringBuffer("Java");
        System.out.println(stringBuffer.reverse());

        //using String (char[])
        String str = new String("Avinash");
        char[] strArray = str.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.println(strArray[i]);
        }

        System.out.println(recursiveMethod("JavaPrograming"));
    }

    //using recursive method
    static String recursiveMethod(String str) {
        if ((null == str || (str.length() <= 1))) {
            return str;
        }
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
