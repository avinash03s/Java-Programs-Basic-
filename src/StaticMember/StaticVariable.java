package StaticMember;

public class StaticVariable {

    static int number=45;
    static String name="Avinash";
}
class ABCD {
    public static void main(String[] args) {
        int number1 = StaticVariable.number;
       String name= StaticVariable.name;
        System.out.println(name +" "+ number1);
    }
}
