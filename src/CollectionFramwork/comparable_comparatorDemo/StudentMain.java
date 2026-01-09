package CollectionFramwork.comparable_comparatorDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student(3, 20, "Avinash", "Surwase");
        Student s2 = new Student(2, 19, "Karan", "Pardesi");
        Student s3 = new Student(1, 21, "Narayan", "Bahir");
        Student s4 = new Student(4, 18, "Pramod", "Maske");
        Student s5 = new Student(6, 15, "Abhishek", "Surwase");
        Student s6 = new Student(5, 22, "Vrushabh", "Munjal");
        Student s7 = new Student(7, 25, "Sushil", "Dhage");
        Student s8 = new Student(8, 30, "Om", "Taware");

        List<Student> studentList = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8);
        Collections.sort(studentList);
//        for (Student s : studentList){
//            System.out.println(s);
//        }

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
