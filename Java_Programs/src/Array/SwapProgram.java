package Array;

public class SwapProgram {
    public static void main(String[] args) {
        int arr[]={10,20};
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int a=0;
        a=arr[0];
        arr[0]=arr[1];
        arr[1]=a;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
