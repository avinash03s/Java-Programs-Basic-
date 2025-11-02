package String;

public class StringConcation {
    public static void main(String[] args) {
        //
        String s="Avinash"; //In SCP "Avinash" object are created;(1 obj)
        String name="Rama"; //"Rama" object are created in SCP;(1 obj)
        String collage=new String("Balbhim collage"); //2 object are created 1 is in Heap and 1 is in SCP (2 obj);
        String s1=s.concat(" "+"Surwase");//in SCP "Avinash Surwase" obj are created;(1 obj);
        System.out.println("Before Concat: "+s);
        System.out.println("After Concat: "+s1);
        System.out.println(name);
        System.out.println(collage);
    }
}

/* String are Immutable (One's We create then can't be modified/change),
 when we try to modify String object then create new object in memory not change exiting obj;*/
