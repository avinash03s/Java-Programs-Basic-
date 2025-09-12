package Array;

import java.util.Arrays;


/*in this code I create two array in 1st array with element and 2nd array are empty
then use for loop then just 2nd line I assine element array in dummy array(dummy[i]=arr[i])
and then for print these array I use (Arrays.toString(my array reference). this method
 */

public class CopyArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int dummy[]=new int [arr.length];

        for (int i=0;i<arr.length;i++){
            dummy[i]=arr[i];
        }


            System.out.println("He is arr"+Arrays.toString(arr));
            System.out.println("He is copy of arr"+Arrays.toString(dummy));

    }
}
