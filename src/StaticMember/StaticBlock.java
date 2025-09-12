package StaticMember;

public class StaticBlock {
    static void run(){
        System.out.println("Run Fast ");
    }
    static {
        StaticBlock.run();
    }

    public static void main(String[] args) {
       // StaticBlock.run();

    }
}
