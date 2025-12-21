package String;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        String s = String.valueOf(getName(2));
        if (s == null){
            System.out.println(s.toUpperCase());
        }

    }
    public static Optional<String> getName(int id){
        String s= "Ram";
        return Optional.of(s);
    }
}
