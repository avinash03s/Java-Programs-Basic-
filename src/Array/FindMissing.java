package Array;

class ProblemArray {

    public static void findMissingFromArray() {
        int[] arr = {1, 2, 4, 5}; //expected sum 150 and actual sum 120
        int n = (5 * (5 + 1)) / 2;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (sum != n) {
            int missing = n - sum;
            System.out.println("Missing Element is : " + missing);
        }
    }
}

public class FindMissing extends ProblemArray {

    public static void main(String[] args) {
        findMissingFromArray();
    }
}
