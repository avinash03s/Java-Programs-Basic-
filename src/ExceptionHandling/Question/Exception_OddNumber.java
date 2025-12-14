package ExceptionHandling.Question;

public class Exception_OddNumber {

    public static void main(String[] args) {
        int number=18;
        tryNumber(number);
    }
    static void tryNumber(int num){
        try {
            checkNumber(num);
        } catch (Exception e) {
            System.out.println("Error.."+e.getMessage());
            e.printStackTrace();
        }
    }
    static void checkNumber(int number) throws RuntimeException{
        if (number %2==0){
            throw new RuntimeException(number+ ":is odd");
        }
    }
}
