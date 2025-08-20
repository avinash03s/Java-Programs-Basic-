package Array;

public class SortReverse {
    public static void main(String[] args) {
        int arr[]={2,9,8,4,5,6,1,3,7};
        for (int i= arr.length-1;i>0;i--){
            for (int j=arr.length-1;j>1;j--){
                if (arr[i]>arr[j]){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        for (int i= arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }
    }
}
