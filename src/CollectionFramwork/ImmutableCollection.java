package CollectionFramwork;
import java.util.List;

public class ImmutableCollection {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        try {
            list.add(10);
            list.remove(1);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
