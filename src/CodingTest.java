import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingTest {
    public static void main(String[] args) {
        String s = "Java J2EE Java JSP J2EE";
        Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        for (Map.Entry<String, Long> m : collect.entrySet()) {
            System.out.println(m);
        }
    }
}

class Class2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 11, 9, 13, 8, 12};
        int sum = 20;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

}

class Class3 {

    public static void main(String[] args) {
        int[] arr = {12, 5, 31, 9, 21, 8};
        int sum = 45;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }
}

