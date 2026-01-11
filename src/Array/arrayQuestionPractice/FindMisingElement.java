package Array.arrayQuestionPractice;

public class FindMisingElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int max = 6;

        int sum = max * (max + 1) / 2;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }

        int missing = sum - sum2;
        System.out.println("Missing element is : " + missing);
    }
}
