package Array;

import java.util.Arrays;

public class CssSorting {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,4,1,6};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int g=arr[i];
                    arr[i]=arr[j];
                    arr[j]=g;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
