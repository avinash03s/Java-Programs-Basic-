package Array.arrayQuestionPractice;

import java.util.Arrays;

public class InsertEelement {

    //Write a Java program to insert an element (specific position) into an array.

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};
        int addEle = 6;
        int position = 5;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = addEle;
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
