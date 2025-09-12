package Array;

public class FindEvenOdd {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,};
        for (int i=0;i<=arr.length;i++){
            if (i%2==0){
                System.out.print("even :");
            }else {
                System.out.print("odd :");
            }
            System.out.println(i);
        }
    }
}
