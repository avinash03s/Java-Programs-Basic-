package Array.arrayQuestionPractice;

public class MinAndMax {

    //Write a Java program to find the maximum and minimum value of an array

    public static void main(String[] args) {
        int[] array = {20, 1, 3, 2, 4, 5, 0};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
