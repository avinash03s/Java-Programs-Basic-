////package Array.arrayQuestionPractice;
////
////import java.util.Arrays;
////
////public class RemoveDuplicate {
////
////    //Write a Java program to remove duplicate elements from an array.
////
////    public static void main(String[] args) {
////        int[] arr = {1, 2, 3, 4, 5, 6, 4, 5, 3, 6};
////        int[] newArr = new int[arr.length];
////        int size = 0;
////
////        for (int i = 0; i < arr.length; i++) {
////            boolean duplicate = false;
////
////            for (int j = 1; j < arr.length; j++) {
////                if (arr[i] == arr[j]) {
////                    duplicate = true;
////                }
////            }
////            newArr[size++] = arr[i];
////
////            if (!duplicate) {
////                System.out.println(arr[i]);
////            }
////        }
//    }
//}
