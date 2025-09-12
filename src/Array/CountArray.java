package Array;

public class CountArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17};
        int eCount=0;
        int oCount=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                eCount++;
            }else {
                oCount++;
            }
        }
        int count= arr.length;

        System.out.println("ArrayCount : "+count);
        System.out.println("EvenCount : "+eCount);
        System.out.println("OddCount : "+oCount);
    }
}
