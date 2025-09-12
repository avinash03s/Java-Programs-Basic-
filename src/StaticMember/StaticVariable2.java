package StaticMember;

public class StaticVariable2 {
    static int number=33;
    static double salary=500;
    int phoneNumber=2222;

}
class XYZ{
    public static void main(String[] args) {

        StaticVariable2 ob = new StaticVariable2();
       /* System.out.println(StaticVariable2.number=22);
        System.out.println(StaticVariable2.salary);
        System.out.println(ob.phoneNumber);
*/
        StaticVariable2 ob2= new StaticVariable2();
        int num=StaticVariable2.number=55;
        System.out.println(num);

        double sal=StaticVariable2.salary=500000;
        System.out.println(sal);

        System.out.println(ob2.phoneNumber=555555);

    }
}
