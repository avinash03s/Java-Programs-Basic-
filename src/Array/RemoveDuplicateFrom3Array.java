package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFrom3Array {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 5, 7};
        int[] arr3 = {8, 9, 10};

        Set<Object> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    set.add(arr1[i]);
                    set.add(arr2[j]);
                    set.add(arr3[k]);
                }
            }
        }
        System.out.println(set);
    }
}
