package CollectionFramwork;

import java.util.*;
import java.util.Comparator;

public class Student2 {
    private int id;
    private int age;
    private String name;

    public Student2(int id, int rollNo, String name) {
        this.id = id;
        this.age = rollNo;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int rollNo) {
        this.age = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", rollNo=" + age +
                ", name='" + name + '\'' +
                '}';
    }


}

class MainStudent {

    public static void main(String[] args) {
        Student2 ob1 = new Student2(101, 22, "Rahul");
        Student2 ob2 = new Student2(103, 20, "Avinash");
        Student2 ob3 = new Student2(102, 21, "Karan");
        Student2 ob4 = new Student2(104, 19, "Raju");

        List<Student2> list = new ArrayList<>();
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);

        System.out.println("---------Sorting By Id---------");
        Collections.sort(list, new SortingId());
        for (Student2 o : list) {
            System.out.println(o);
        }

        System.out.println();
        System.out.println("-------Sorting By Age--------");
        Collections.sort(list, new SortingAge());
        for (Student2 o : list) {
            System.out.println(o);
        }


        System.out.println();
        System.out.println("--------Sorting By Name-----------");
        Collections.sort(list, new SortingName());
        for (Student2 o : list) {
            System.out.println(o);
        }
    }
}

class SortingId implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        return s1.getId() - s2.getId();
    }
}

class SortingName implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class SortingAge implements Comparator<Student2>{
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getAge() - o2.getAge();
    }
}
