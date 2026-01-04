package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Map;

public class StudentMarksMap {

    public static void main(String[] args) {
        Map<Integer, Integer> studentsMarks = new HashMap<>();
        studentsMarks.put(101, 85);
        studentsMarks.put(102, 60);
        studentsMarks.put(103, 76);
        studentsMarks.put(104, 88);

        //Iterate student marks
        for (Map.Entry<Integer, Integer> entry : studentsMarks.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Marks: " + entry.getValue());
        }

        //find Highest and lowest marks
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int marks : studentsMarks.values()) {
            if (marks > max) max = marks;
            if (marks < min) min = marks;
        }
        System.out.println("Min Marks: " + min);
        System.out.println("Max Marks: " + max);


        //search Student
        int searchRollNo = 103;
        if (studentsMarks.containsKey(searchRollNo)) {
            System.out.println("\nRoll No " + searchRollNo + " Marks: " + studentsMarks.get(searchRollNo));
        }
        System.out.println("------------------------------------------");
        //update marks
        studentsMarks.put(102, 99);

        for (Map.Entry<Integer, Integer> entry : studentsMarks.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
        System.out.println("-----------------------------------");
        //iterate using lambada
        studentsMarks.forEach((k, v) -> System.out.println("Roll No: " + k + ", Marks: " + v));

    }
}
