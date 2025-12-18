package Array;


import Inheritance.C;

import java.util.Arrays;

public class ClockwiseArray {

    void arrLogic() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i]  < arr[j]) {
                    int tem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        ClockwiseArray ob = new ClockwiseArray();
        ob.arrLogic();
    }
}
