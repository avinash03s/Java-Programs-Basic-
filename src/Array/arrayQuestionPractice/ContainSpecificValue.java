package Array.arrayQuestionPractice;

public class ContainSpecificValue {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 6};
        int containValue = 3;

        for (int i = 0; i < arr.length; i++) {
            if (containValue == arr[i]) {
                System.out.println("Given Value contain in Array" + "value is: " + arr[i]);
                break;
            }
        }
    }
}
