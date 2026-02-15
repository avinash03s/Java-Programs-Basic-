package java_9_feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Class{

    static void takeWhileMethod(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.stream().takeWhile(x->x < 6).forEach(System.out::println);
    }

    static void drowWhile(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.stream().dropWhile(x-> x > 5).forEach(System.out::println);
    }

    static void ofNullable(){

    }
}
public class StreamAPIImprovements extends Class{

    public static void main(String[] args) {
        takeWhileMethod();
        System.out.println("---------------------------------------------");
        drowWhile();
    }
}

/// takeWhile()
/// If calling stream is ordered, then this method returns a stream containing first n elements of the
///calling stream which satisfy the given predicate. It immediately terminates the operation as soon as
///it sees an element which doesn’t satisfy the predicate and it doesn’t evaluate remaining elements even
///though there may be elements which satisfy the given predicate.

/// If the calling stream is unordered then this method returns all or some elements which
///satisfy the given predicate. In such conditions, behavior of this method becomes non-deterministic

///drowWhile()
///This method is total opposite of takeWhile(). This method drops first n elements which
///satisfy the given predicate and returns remaining elements if the calling stream is ordered.