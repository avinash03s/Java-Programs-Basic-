import java.util.HashSet;
import java.util.Set;

public class ClassArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {2, 3, 5, 6, 7};
        int[] arr2 = {8, 9, 10};

        Set set = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr1.length; j++){
                if (arr[i] == arr1[j]){
                    for (int k = 1; k < arr2.length; k++){

                    }
                }
            }
        }
    }
}
