package Array;

import java.util.Arrays;

public class CssReverseArr {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,2,6,8,7};
        for (int i=arr.length-1;i>0;i--){
            for (int j=arr.length-1;j>0;j--){
                if (arr[i]<arr[j]){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
