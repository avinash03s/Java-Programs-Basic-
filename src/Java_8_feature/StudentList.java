package Java_8_feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
    private int id;
    private int age;
    private String name;

    public StudentList(int id, int age, String name) {
        this.id = id;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class MainStudentList {

    public static void main(String[] args) {
        StudentList ob1 = new StudentList(101,20,"Avinash");
        StudentList ob2 = new StudentList(105,25,"Bala");
        StudentList ob3 = new StudentList(103,30,"Chiku");
        StudentList ob4 = new StudentList(104,40,"Danav");
        StudentList ob5 = new StudentList(102,35,"Raju");

        List<StudentList> list = new ArrayList<>();
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);
        list.add(ob5);

        //Sorting using Comparator(I) with Lambda
        Collections.sort(list,(a , b)-> b.getId() - a.getId());
//        Collections.sort(list,(a , b)-> a.getAge() - b.getAge());
//        Collections.sort(list,(a , b)-> b.getName().compareTo(a.getName()));
        for (StudentList sl : list){
            System.out.println(sl);
        }
    }
}
