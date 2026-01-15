package Array;

import java.util.Arrays;
import java.util.List;

public class ArrayProblem {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 6, 0, 5, 9, 8};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
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
