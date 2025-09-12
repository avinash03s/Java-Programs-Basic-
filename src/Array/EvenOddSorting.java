package Array;
/*1st I create array and then using for loop check this array are even or odd
* then use 2nd loop for sorting array and inside the 2nd for loop I use if statement
* for swap and sorting and then outside loop 1 & 2 write 3rd loop for printing .*/
public class EvenOddSorting {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,2,6,8,7};
        for (int i=0;i<arr.length;i++){
                if (arr[i]%2==0){
                    System.out.print("Even no :");
                }else{
                    System.out.print("Odd no :");
                }
            System.out.println(arr[i]);


                for (int j=0;j<arr.length;j++){
                    if (arr[i]<arr[j]){
                        int a=arr[i];
                        arr[i]=arr[j];
                        arr[j]=a;
                    }
                }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
