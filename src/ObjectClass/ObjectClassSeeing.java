package ObjectClass;
import java.lang.Object;

public class ObjectClassSeeing {
    public static void main(String[] args) {
        Object ob=new Object();
        /*ob.equals(ob);
        ob.getClass();
        ob.hashCode();*/
        System.out.println(ob.equals(ob));
        System.out.println(ob.getClass());
        System.out.println(ob.hashCode());
    }
    String sc= new String("java");

}
