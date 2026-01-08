package Array;

import java.util.HashSet;

public class FindCommonElement {

    public static void main(String[] args) {
        String [] arr = {"1","2","3","2","3","4","0"};
        String  [] arr1 = {"1","2","3","2","3","4","0"};
        HashSet<String> set = new HashSet<String>();
        for (int i = 0;i < arr.length; i++){
            for (int j = 1; j < arr1.length; j++){
                if (arr[i].equals(arr[j])){
                    set.add(arr[i]);
                }
            }
        }
        System.out.println(set);
    }
}
