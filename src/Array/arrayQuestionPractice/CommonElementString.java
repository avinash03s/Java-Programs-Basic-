package Array.arrayQuestionPractice;

public class CommonElementString {

    //Write a Java program to find common elements between two arrays (string values).

    public static void main(String[] args) {
        String[] str = {"A", "B", "C", "D", "E"};
        String[] str2 = {"A", "K", "F", "D", "E"};


        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str[i].equals(str2[j])) {
                    System.out.println(str[i]);
                    break;
                }
            }
        }
    }
}
