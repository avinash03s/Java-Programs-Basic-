package Array;

import java.util.Arrays;

public class ReverseHtmlArr {
    public static void main(String[] args) {
        int arr[]={8,1,3,2,5,4,7,6};

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int s=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=s;
                }
            }
        }
        /*for (int i=arr.length-1;i>0;i--){
            System.out.println(arr[i]);*/
        //}
        System.out.println(Arrays.toString(arr));
    }
}
