package Array;

public class FindEvenOddNumber {
    public static void main(String[] args) {
        int arr[]={23,45,44,66,78,99};
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.print("Even No.");
            }else {
                System.out.print("Odd No.");
            }
            System.out.println(arr[i]);
        }
    }
}
