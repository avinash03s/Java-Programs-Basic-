package Array.arrayQuestionPractice;

public class EvenIndexEven {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % 2 == 1 && i % 2 == 0) {
                    int tem = arr[i];
                    arr[j] = arr[i];
                    arr[i] = tem;
                }
            }
            System.out.println("Index: " + i + " = " + arr[i]);
        }
    }
}
