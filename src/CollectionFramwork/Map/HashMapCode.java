package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* Given a studentNameMarksMap having name of students as keys and their marks in mathematics as values,
give required grace marks and pass those students who have scored above 30. Passing marks is 35?*/
public class HashMapCode {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aditya Sen", 57);
        map.put("Harris Brar", 34);
        map.put("Sarah Amin", 61);
        map.put("Rishika Gowda", 75);
        map.put("Rohit Gupta", 68);
        map.put("Andriel Hope", 31);
        map.put("Deepti Sharma", 81);
        map.put("Irfan Ali", 33);
        map.put("Ruth Prabhu", 66);
        map.put("Arun Trivedi", 29);

        System.out.println("----------------Before Update-------------------");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int marks = entry.getValue();
            if (marks >= 30 && marks < 35) {
                entry.setValue(35);
            }
        }

        System.out.println("---------------After Update----------------------");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}
