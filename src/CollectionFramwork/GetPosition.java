package CollectionFramwork;

import java.util.ArrayList;

public class GetPosition {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Avinash");
        list.add("Rahul");
        list.add("Pramod");
        list.add("Om T");
        list.add("Aniket");
        list.add("Ganesh");

        System.out.println(list.contains("Om T"));// if element is present return true;
        System.out.println(list.contains("Java"));// if element are not present then return false;
        System.out.println(list.indexOf("Om T"));
        System.out.println(list.lastIndexOf("Raju"));//if index are not present in this list return -1;
    }
}
