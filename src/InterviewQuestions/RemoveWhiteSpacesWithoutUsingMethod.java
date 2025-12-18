package InterviewQuestions;

public class RemoveWhiteSpacesWithoutUsingMethod {

    public static void main(String[] args) {

        String s = "Java Programing Language";
        char[] chaArr = s.toCharArray();
        String tem = "";

        for (int i = 0; i < chaArr.length; i++) {
            if ((chaArr[i] != ' ') && (chaArr[i] != '\t')) {
//                tem = tem.concat(String.valueOf(chaArr[i]));
                tem = tem + chaArr[i];
            }
        }

        System.out.println("Original String: " + s);
        System.out.println("Without Spaces String: " + tem);
    }
}
