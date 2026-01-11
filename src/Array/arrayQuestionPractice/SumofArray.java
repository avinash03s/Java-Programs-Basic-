package Array.arrayQuestionPractice;

public class SumofArray {

    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 10};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Array: " + sum);

        double avg = (double) sum / arr.length;
        System.out.println("Avg of Array: " + avg);
    }
}
