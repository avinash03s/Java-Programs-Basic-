package Array.arrayQuestionPractice;

public class FindDuplicateFromString {

    //Write a Java program to find duplicate values in an array of string values.

    public static void main(String[] args) {
        String[] str = {"Avinash", "Rahul", "Pramod", "Avinash", "Pramod", "Rahul", "Ravi"};

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    System.out.println(str[i]);
                    break;
                }
            }
        }
    }
}
