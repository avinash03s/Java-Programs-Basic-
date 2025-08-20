package Array;

public class ArrayO {
    public static void main(String[] args) {
        int arr[]={10,30,40};
        sum(arr);
    }
    static void sum(int arr[]){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
