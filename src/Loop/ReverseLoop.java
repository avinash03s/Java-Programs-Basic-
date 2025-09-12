package Loop;

public class ReverseLoop {
    public static void main(String[] args) {
        for (int i=10;i>=1;i--){
            if (i%2==0){
                System.out.print("Even no : ");
            }else {
                System.out.print("odd no : ");
            }
            System.out.println(i);
        }
    }
}
