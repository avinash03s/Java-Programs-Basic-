package Array;

import java.util.Arrays;

public class HtmlCopy {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,7,2,6};
        int emt[]=new int [arr.length];
        for (int i=0;i< arr.length;i++){

            emt= new int[]{arr[i]};

            for (int j=0;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        System.out.println("he is 1st arr"+ Arrays.toString(arr));
        System.out.println("He is copy arr(emt)"+Arrays.toString(emt));


    }
}
