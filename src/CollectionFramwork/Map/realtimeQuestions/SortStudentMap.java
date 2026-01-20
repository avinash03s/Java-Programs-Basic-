package CollectionFramwork.Map.realtimeQuestions;

import java.util.*;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SortStudentMap {
    public static void main(String[] args) {
        Student s1 = new Student(103, "Avinash");
        Student s2 = new Student(104, "Rahul");
        Student s3 = new Student(101, "Sham");
        Student s4 = new Student(102, "Ramu");

        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(s1.getId(), s1.getName());
        stringMap.put(s2.getId(), s2.getName());
        stringMap.put(s3.getId(), s3.getName());
        stringMap.put(s4.getId(), s4.getName());

        System.out.println("---Sort Map----");
        Map<Integer, String> sortStudentMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        sortStudentMap.putAll(stringMap);

        for (Map.Entry<Integer, String> map : sortStudentMap.entrySet()) {
            System.out.println(map);
        }
        System.out.println("----------------------------------------------------");
        System.out.println();

        System.out.println("---sort Reverse ordering---");
        Map<Integer, String> reverseSort = new TreeMap<>(Collections.reverseOrder());
        reverseSort.putAll(stringMap);
        System.out.println(reverseSort);
    }
}
