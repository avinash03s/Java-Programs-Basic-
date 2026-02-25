package java_11_feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class NegatingThePredicate {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList(" ", "\t", "\n", "One", "Two", "Three");
        List<String> collect = listOfStrings.stream().filter(s -> !s.isBlank()).toList();
        System.out.println(collect);

        //Predicate.not();
        List<String> list = listOfStrings.stream().filter(Predicate.not(String::isBlank)).toList();
        System.out.println(list);
    }
}
