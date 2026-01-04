import java.util.Arrays;
//1. Write a program to rearrange the elements of an integer array such that:
//Elements at even index positions contain even numbers
//Elements at odd index positions contain odd numbers
public class ArrayProblem {

    public static void main(String[] args) {
        int arr [] = {2,10,3,5,4,6,7,8,0,1};
        //           ( 0,1,2,3,4,5,6,7,8,9)
        for (int i = 0; i < arr.length; i++){
            if (i % 2 != 0 && arr[i] % 2 == 0){
//                for (int j = 1; j < arr.length; j++){
//                    if (j % 2 == 1 && arr[j] % 2 != 0){
//                        int tem = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = tem;
//                        break;
//                    }
//                }
                int tem = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = tem;
            }else if (i % 2 == 0 && arr[i] % 2 != 0){
//                for (int j = i + 1; j < arr.length; j++){
//                    if (j % 2 == 0 && arr[j] % 2 == 1){
//                        int tem = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = tem;
//                        break;
//                    }
                int tem = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = tem;
                }
            }
        System.out.println(Arrays.toString(arr));
        }
    }