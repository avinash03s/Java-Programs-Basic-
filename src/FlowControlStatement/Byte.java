package FlowControlStatement;

public class Byte {
    public static void main(String[] args) {
        byte b=10;
        switch (b+1){
            case 10:
                System.out.println("20");
                break;
            case 100:
                System.out.println("100");
                break;
            case 1000:
                System.out.println("1000");
                break;
        }
    }
}
