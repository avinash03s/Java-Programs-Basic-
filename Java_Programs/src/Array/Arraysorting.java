package Array;

import java.util.Arrays;

public class Arraysorting {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,6,7};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int num=arr[i];
                    arr[i]=arr[j];
                    arr[j]=num;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
