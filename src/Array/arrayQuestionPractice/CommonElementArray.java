package Array.arrayQuestionPractice;

public class CommonElementArray {

    //Write a Java program to find common elements between two integer arrays.

    public static void main(String[] args) {
        int[] arr1 = {12, 14, 2, 5, 14, 15};
        int[] arr2 = {15, 32, 5, 13, 4, 24, 12};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
