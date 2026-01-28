package Array;

class Problem {

    static void findFactorialByNumber() {
        int factorial = 1;

        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 1 to 10 : " + factorial);
        System.out.println();
    }

    static void findFactorialArray() {
        int[] arr = {3, 4, 5, 2, 6, 7};
        int factorial = 1;

        for (int i = 0; i < arr.length; i++) {
            factorial *= arr[i];
        }
        System.out.println("Array Element Factorial: " + factorial);
        System.out.println();
    }

    static void charProduct() {
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        int product = 1;

        for (char ch : chars) {
            product *= ch;
        }
        System.out.println("Char Product : " + product);
        System.out.println();
    }
}

public class FactorialExample extends Problem {

    public static void main(String[] args) {
        findFactorialByNumber();
        findFactorialArray();
        charProduct();
    }
}