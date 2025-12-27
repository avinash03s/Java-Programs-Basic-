package CollectionFramwork;

public class ComparableInterface {

    public static void main(String[] args) {
        //compareTo() methods
        System.out.println("A".compareTo("Z"));//-
        System.out.println("Z".compareTo("A"));//+
        System.out.println("A".compareTo("A"));//o
        System.out.println("A".compareTo(null));//to give NullPointerException
    }
}
