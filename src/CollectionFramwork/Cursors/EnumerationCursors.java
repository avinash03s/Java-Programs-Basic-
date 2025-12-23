package CollectionFramwork.Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursors {

    public static void main(String[] args) {
        Vector v = new Vector();

        for (int i = 0; i < 10;i++){
            v.addElement(i);
        }

        System.out.println(v);

        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            Integer i = (Integer) e.nextElement();
            if (i % 2 == 0){
                System.out.println("Even : "+i);
            }
//            else {
//                System.out.println("Odd : "+i);
//            }
        }
    }
}
//why we need cursors : I was not need all object I won't only some specific object or element then use cursors;

//or I Won't one by one object then use cursors;