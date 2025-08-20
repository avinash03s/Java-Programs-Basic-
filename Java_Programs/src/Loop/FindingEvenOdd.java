package Loop;

public class FindingEvenOdd {
    public static void main(String[] args) {
        int arr[]={12,4,5,7,6,8,6,5};
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]%2==0){
                System.out.print("Even N0:" );
            }else {
                System.out.print("Odd No:" );
            }
            System.out.println(arr[i]);
        }
    }
}
