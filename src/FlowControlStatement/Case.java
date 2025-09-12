package FlowControlStatement;

public class Case {
    public static void main(String[] args) {
        int x=10;
        switch (x+1){
            case 10:
                System.out.println("10");
                break;
            case 10+20+30:
                System.out.println("60");
        }
        System.out.println(x);
    }
}
