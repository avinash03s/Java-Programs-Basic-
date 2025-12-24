package CollectionFramwork;

import java.util.ArrayList;

public class FindSizeOfArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Avinash");
        list.add("Pramod");
        list.add("Sushil");
        list.add("Karan");
        list.add("Rahul");
        list.add("Abhishek");
        list.add("Ritesh");

//        System.out.println(list);
        System.out.println("List Size is: "+list.size());//find size of how element present in ArrayList;
        for (String str:list){
            System.out.println(str);
        }
    }
}
