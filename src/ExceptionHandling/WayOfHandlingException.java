package ExceptionHandling;

public class WayOfHandlingException {
    public static void main(String[] args) {
        System.out.println("WayOfHandlingException.main");
        WayOfHandlingException ob=null;
        try {
            ob.run();
        }catch (Exception e){
            System.out.println("Handling exception");
            e.printStackTrace();
        }
    }
    void run(){
        System.out.println("WayOfHandlingException.run");
    }
}
