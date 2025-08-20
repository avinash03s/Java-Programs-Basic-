package QuestionPractic;

//Write a method that takes an array of integers and returns a new array with the elements in reverse order

public class _3rdArrayQ {

       public static void reverseArray(int arr[]){
            for (int i= arr.length-1;i>=0;i--){
                System.out.print(" "+arr[i]);
            }

        }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverseArray(arr);
    }
    }



