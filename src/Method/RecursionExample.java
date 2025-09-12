package Method;

public class RecursionExample {
    static void countDown(int num){
        if (num<0){
            return;
        }else {
            System.out.println(num);
            countDown(num-1);
        }
    }

    public static void main(String[] args) {
        countDown(4);
    }
}
