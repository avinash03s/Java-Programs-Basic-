package Array;

import java.util.Arrays;

public class Arraysorting {
    public static void main(String[] args) {
        int arr[]={6,2,4,5,3,1,7};
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
