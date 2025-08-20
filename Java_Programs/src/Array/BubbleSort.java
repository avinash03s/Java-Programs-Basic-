package Array;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={22,11,33,55,44};
        for (int i=0;i< arr.length;i++){

            for (int j=1;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
