package Array;

public class FindMidWithoutTemVar {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int mid = arr.length / 2;

        for (int i = 0; i < mid; i++) {
            int tem = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tem;
        }
        System.out.println(arr[mid]);
    }
}

class FindAvg {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("Sum of these array : " + sum);
        System.out.println("Avg of : " + avg);
    }
}