package Array.arrayQuestionPractice;

import java.util.Arrays;

public class RemoveElement {

    //Write a Java program to remove a specific element from an array.

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int removeEle = 5;
        int count = 0;
        for (int i : arr) {
            if (i != removeEle) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (arr[i] != removeEle) {
                newArr[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
}
