package ExceptionHandling;

public class FinallyBlock {

    void display(){
        int a=5;
        int b=0;
        int c=a/b;
        System.out.println(c);
//        System.out.println("In this method User Enter Invalid Input");
    }
    public static void main(String[] args) {
        FinallyBlock ob= new FinallyBlock();
        try {
            ob.display();
        }catch (Exception e){
//            System.out.println("Handle exception");
        }finally {
            System.out.println("This is Finally Block..");//finally block always run;
        }
    }
}
