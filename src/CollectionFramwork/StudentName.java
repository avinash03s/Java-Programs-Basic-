package CollectionFramwork;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentName implements Comparator<StudentName> {
    private String name;

    StudentName() {

    }

    StudentName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "StudentName{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(StudentName o1, StudentName o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class StudentNameMain {

    public static void main(String[] args) {
//        StudentName ob1 = new StudentName("Mohan");
//        StudentName ob2 = new StudentName("Avinash");
//        StudentName ob3 = new StudentName("Zoya");
//        StudentName ob4 = new StudentName("Karan");
//        StudentName ob5 = new StudentName("Deepak");
//        StudentName ob6 = new StudentName("Riya");
//        StudentName ob7 = new StudentName("Mohan");
//        StudentName ob8 = new StudentName("Bhavesh");
//        StudentName ob9 = new StudentName("Yash");
//        StudentName ob10 = new StudentName("Lakshmi");
//        StudentName ob11 = new StudentName("Prakash");
//        StudentName ob12 = new StudentName("Chaitanya");
//        StudentName ob13 = new StudentName("Harsh");
//        StudentName ob14 = new StudentName("Suresh");
//        StudentName ob15 = new StudentName("Vikram");
//
//        TreeSet<StudentName> list = new TreeSet<>(new StudentName(""));
//        list.add(ob1);
//        list.add(ob2);
//        list.add(ob3);
//        list.add(ob4);
//        list.add(ob5);
//        list.add(ob6);
//        list.add(ob7);
//        list.add(ob8);
//        list.add(ob9);
//        list.add(ob10);
//        list.add(ob11);
//        list.add(ob12);
//        list.add(ob13);
//        list.add(ob14);
//        list.add(ob15);
//
//        System.out.println("Alphabetical Order: ");
//        for (StudentName s : list) {
//            System.out.println(s);
//        }

        String[] names = {
                "Mohan", "Avinash", "Zoya", "Karan", "Deepak",
                "Riya", "Ram", "Bhavesh", "Yash", "Lakshmi",
                "Prakash", "Chaitanya", "Harsh", "Suresh", "Vikram"
        };

        TreeSet<StudentName> set =
                new TreeSet<StudentName>(new StudentName());

        for (int i = 0; i < names.length; i++) {
            set.add(new StudentName(names[i]));
        }


        System.out.println("Alphabetical Order: ");
        for (StudentName s : set) {
            System.out.println(s);
        }


    }
}
