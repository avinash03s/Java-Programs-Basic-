package Array;

import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        int []arr = {1,2,4,3,5,7,6};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr.length; j++){
                if (arr[i] < arr[j]){
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
