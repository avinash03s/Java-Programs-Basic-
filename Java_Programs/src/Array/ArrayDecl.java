package Array;

public class ArrayDecl {
    public static void main(String[] args) {
        int arr[]={10,30,40,50};
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
/*1st i create class and main method then create array and store in sum name
variable and then create sum name method and then make for loop in for loop i write condition to print array
and then next line i use operator (+=) for sum of array and then print sum.
 */
