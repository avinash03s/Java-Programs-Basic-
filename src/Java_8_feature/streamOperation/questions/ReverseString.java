package Java_8_feature.streamOperation.questions;

import java.util.Arrays;
import java.util.List;


public class ReverseString {

    public static void main(String[] args) {
        String s = "avinash";
        List<String> list = Arrays.stream(s.split("")).sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(list);
    }
}
