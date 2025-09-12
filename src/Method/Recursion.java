package Method;

public class Recursion {
    static int fact(int num){
        if (num==1 || num==0){
            return 1;
        }
        return num *fact(num-1);
    }

    public static void main(String[] args) {
        System.out.println("The factorial of 6 is "+fact(6));
    }
}
