package ExceptionHandling;

import java.io.File;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {

        // without resources
        Scanner sc=null;
        try {
            sc=new Scanner(new File("text.xt"));
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sc != null){
                sc.close();
            }
        }

        //with-resources

        try(Scanner scanner= new Scanner( new File("text.xt")))
        {
            if (scanner != null){
                System.out.println("Enter Input");
                System.out.println(scanner.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
