package CollectionFramwork.Map;

import ExceptionHandling.CustomException;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String,Long> map = new HashMap<>();
        map.put("Avinash",8767622435L);
        map.put("Rahul",874736826L);
        map.put("Karan",8773647261L);
        map.put("Narayan",8782734564L);
        map.put("Om",3847394738L);

        long number = map.get("Karan");
        System.out.println("Karan Phone No : "+number);

        //if key are not present then throw exception
        try {
            long number2 = map.get("Raju");
            System.out.println(number2);
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
