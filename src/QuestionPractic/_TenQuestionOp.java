package QuestionPractic;

//Take the base and height of a triangle and calculate its area using formula (base \* height) / 2.
//Formula(1/2*base*height)
import java.util.Scanner;

public class _TenQuestionOp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Base");
        int base=sc.nextInt();
        System.out.println("Enter Height");
        int height=sc.nextInt();
        double area=0.5*base*height;
        System.out.println("Triangle Area :"+area);
    }
}
