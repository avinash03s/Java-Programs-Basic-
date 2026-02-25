package java_9_feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamImprovement {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(3, 2, 5, 4, 1, 6, 8, 7, 9, 10));
        List<Integer> collect = integers.stream()
                .sorted()
                .takeWhile(x -> x < 70).toList();///intermediate and short-circuiting
        System.out.println(collect);
        /// Purpose: Returns elements from the start of the stream until the predicate fails.
        /// Why useful: Efficient for stopping early without checking all elements.
        /// Problem in Java 8: If you wanted to process only the first “matching” elements, you had to manually loop or use filter + break logic. Filtering alone would check all elements, even unnecessary ones.
        /// Why introduced: Efficiently stops the stream once the condition fails.

        List<Integer> limit = Stream.iterate(1, integer -> integer + 1).limit(5).toList();
        System.out.println(limit);
        /// Stream<T> stream = Stream.iterate(seed, next).limit(n);
        /// seed → starting value (first element of the stream)
        /// next → a function that takes the current element and produces the next element
        /// limit(n) → stops the stream after n elements
        /// Problem in Java 8: Stream.iterate(seed, next) creates an infinite stream, so you always had to add .limit(n) to avoid an endless stream.

        String name = null;
        Stream<String> name1 = Stream.ofNullable(name);
        System.out.println(name1.count());
        /// ***If the variable is not null, it creates a stream containing that value:
        /// ***If the variable is null, it creates an empty stream (stream with no elements):
        /// ***Why this is useful - You don’t have to manually check for null:


        /// Purpose: Creates a stream with a single element if it’s non-null, or an empty stream if it’s null.
        /// Why introduced: Simplifies null handling in streams
        /// Benefit: Less boilerplate, safer code, reduces NullPointerException risk.


        List<Integer> list = integers.stream().dropWhile(x -> x < 5).toList();
        System.out.println(list);///intermediate and short-circuiting

        /// Purpose: Skips elements from the start of the stream while the predicate is true.
        /// Why useful: Opposite of takeWhile.


        /// MAJOR DIFFERENCE BETWEEN (takeWhile, dropWhile, filter)

        /// takeWhile stops when the predicate fails;
        ///dropWhile skips elements until the predicate fails;
        ///filter processes all elements.

        /// How does Stream.iterate(seed, hasNext, next) differ from Stream.iterate(seed, next)?
        /// Key point: Java 9 version stops automatically; Java 8 version is infinite unless limit() is used.

        /// What is Stream.ofNullable() used for?
        /// Key point: Converts a potentially null object into a stream safely.

        /// Which Stream methods are short-circuiting in Java 9?
        /// Key methods: takeWhile(), dropWhile(), limit(n)

        /// What are private methods in interfaces in Java 9?
        /// Interfaces can now have private methods to avoid code duplication in default or static methods.
    }
}
