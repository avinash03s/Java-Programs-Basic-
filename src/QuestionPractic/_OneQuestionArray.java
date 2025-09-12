package QuestionPractic;

public class _OneQuestionArray {

    //write method an array to calculate sum of even number in array.

        public static int sumEvenNumbers(int[] arr) {
            int sum=0;
           for (int i=0;i<= arr.length;i++){
               if (i%2==0){
                   sum+=i;
               }
           }
           return sum;
        }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6};
            System.out.println("Sum of even numbers: " + sumEvenNumbers(numbers));
        }
    }


