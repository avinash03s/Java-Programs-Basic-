package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String courseName;

    Student(int id, String name, String courseName) {
        this.id = id;
        this.name = name;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourseName() {
        return courseName;
    }
}

class StudentData {

    List<Student> stdData() {
        Student ob1 = new Student(101, "Avinash", "Java");
        Student ob2 = new Student(102, "Raju", "Python");
        Student ob3 = new Student(103, "Rahul", "C++");

        List<Student> studentList = new ArrayList<>();
        studentList.add(ob1);
        studentList.add(ob2);
        studentList.add(ob3);

        return studentList;
    }
}

class StudentApp {

    public static void main(String[] args) {
        StudentData ob = new StudentData();

        List<Student> list = ob.stdData();

        for (Student obj : list) {
            System.out.println("Student ID: " + obj.getId());
            System.out.println("Student Name: " + obj.getName());
            System.out.println("Course Name: " + obj.getCourseName());
            System.out.println("\n");
        }
    }
}
class Comparator {

}
