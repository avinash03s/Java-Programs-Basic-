package QuestionPractic.NumberPrinting;

//Write a program to print all even numbers between 1 to 100

public class EvenPrint {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.println("Even No: "+i);
            }
        }
    }
}
