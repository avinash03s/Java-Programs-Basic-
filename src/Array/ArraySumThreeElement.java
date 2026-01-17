package Array;

public class ArraySumThreeElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 10) {
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                        break;
                    }
                    break;
                }

            }
        }
    }
}

class ArraySumTwoElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 4, 5};
        int target = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }
}
