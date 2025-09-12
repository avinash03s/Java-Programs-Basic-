package Array;

public class ArrSorting {
    public static void main(String[] args) {
        int arr[]={30,20,10,50,40,70,80,60};
        for (int i=0;i<arr.length;i++){

            for (int j=1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
