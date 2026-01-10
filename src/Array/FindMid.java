package Array;

public class FindMid {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int mid = arr.length/2;

        for (int i = 0; i < mid; i++){
            int tem = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=tem;
        }
        System.out.println(arr[mid]);
    }
}
