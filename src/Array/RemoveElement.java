package Array;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int removeElement=4;

        for (int i = removeElement; i<arr.length-1;i++){
            arr[i] = arr[i + 1];
        }
        System.out.println(removeElement);
    }
}
