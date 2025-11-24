package ExceptionHandling;

public class MultipleTryBlock {
    public static void main(String[] args) {
        try {
            int arr[]={1,2};
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (Exception e){
            System.out.println("Other error..!");
        }
    }
}
