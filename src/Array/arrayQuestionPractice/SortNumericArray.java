package Array.arrayQuestionPractice;

import java.util.Arrays;

public class SortNumericArray {

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
