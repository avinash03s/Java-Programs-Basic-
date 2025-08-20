import java.util.Scanner;

public class ScannerProgram {
    public static void main(String[] args) {
        String name;
        String surname;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name");
        name=sc.nextLine();
        System.out.println("Enter Your Last Name");
        surname=sc.nextLine();
        System.out.println(name + surname);
    }
}
// Real time application made apun most time use this data type:
//1)int , 2)long , 3)double , 4)boolean. (Primitive)
//1)String   (Non-Primitive)
