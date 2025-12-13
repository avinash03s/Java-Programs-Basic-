package ExceptionHandling;

public class OneTryMultipleCatch {
    public static void main(String[] args) {
        try {
            int result=100/2;
            System.out.println(result);


            OneTryMultipleCatch ob= new OneTryMultipleCatch();
            ob.test();

            int arr[]={1,2,3,4};
            System.out.println(arr[0]);


        }catch (ArithmeticException arithmeticException){
            System.out.println("ArithmeticException "+arithmeticException.getCause());
        }catch (NullPointerException nul){
            System.out.println("NullPointerException "+nul.getCause());
        }catch (ArrayIndexOutOfBoundsException arr){
            System.out.println("ArrayIndexOutOfBoundsException "+arr.getCause());
        } catch (Exception e) {
            System.out.println("Some other error");
            e.printStackTrace();
        }
    }

    void test(){
        System.out.println("OneTryMultipleCatch.test");
    }
}
