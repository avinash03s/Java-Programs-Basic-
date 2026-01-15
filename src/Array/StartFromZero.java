package Array;

import java.util.Arrays;

public class StartFromZero {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 4, 5, 6, 0, 0, 7, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == 0) {
                        int tem = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tem;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
