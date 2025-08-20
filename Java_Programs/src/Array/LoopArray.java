package Array;

public class LoopArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,5,3,};
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                System.out.print("Even no :");
            }else {
                System.out.print("Odd no :");
            }
            System.out.println(arr[i]);
        }
    }
}
