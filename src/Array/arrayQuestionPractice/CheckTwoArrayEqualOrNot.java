package Array.arrayQuestionPractice;

public class CheckTwoArrayEqualOrNot {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        if (arr1.length == arr2.length){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }
    }
}
