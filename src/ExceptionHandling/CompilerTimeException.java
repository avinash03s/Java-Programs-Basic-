package ExceptionHandling;


// this is way of create object in java (Way Name-Factory Method);

public class CompilerTimeException {
    public static void main(String[] args){

        try {
            Class cls=Class.forName("ExceptionHandling.CompilerTimeException");
            CompilerTimeException ob=(CompilerTimeException)cls.newInstance();
            ob.run();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
    void run(){
        System.out.println("CompilerTimeException.run");
    }
}
