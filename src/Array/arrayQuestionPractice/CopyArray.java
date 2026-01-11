package Array.arrayQuestionPractice;

public class CopyArray {

    //Write a Java program to copy an array by iterating the array.

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copyArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        System.out.println("Copy Array");
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
    }
}
