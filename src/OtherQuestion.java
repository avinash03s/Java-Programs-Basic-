import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OtherQuestion {

    public static void main(String[] args) {
        /// question convert delimiter list string to single string
        List<String> list = new ArrayList<>(Arrays.asList("java","developer","avinash"));
        String str = list.stream().collect(Collectors.joining(""));
        System.out.println(str);

        /// get the highest length of list of string
        list.stream().sorted((a,b)->b.length() - a.length())
                .limit(1)
                .forEach(System.out::println);
    }
}
