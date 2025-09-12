package QuestionPractic;

//Write a method that takes an array of integers and returns the largest number in the array.

public class _SecondQuestionArray {
    public static int maxFind(int arr[]){
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={22,44,55,7,99};
        System.out.println(maxFind(arr));
    }
}
