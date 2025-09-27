package Array;

import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,4,5,6};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]+" ");
                    break;
                }
            }
        }
    }
}

class Find{
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,5,6,4};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        System.out.println("Array Sort: "+Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate element: "+arr[i]);
                    break;
                }
            }
        }
    }
}