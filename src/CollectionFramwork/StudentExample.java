package CollectionFramwork;

import java.util.TreeSet;

public class StudentExample implements Comparable{
    private int id;
    private int age;
    private String name;

    StudentExample(int id,int age, String name){
        this.id= id;
        this.age= age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentExample{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int id = this.id;
        StudentExample se = (StudentExample) o;
        int id2 = se.id;
        if (id < id2){
            return -1;
        } else if (id >id2) {
            return +1;
        }else {
            return 0;
        }
    }
}
class StudentMain{

    public static void main(String[] args) {
        StudentExample ob1 = new StudentExample(105,20,"Avinash");
        StudentExample ob2 = new StudentExample(103,30,"Rahul");
        StudentExample ob3 = new StudentExample(102,15,"Karan");
        StudentExample ob4 = new StudentExample(104,25,"Abhishek");
        StudentExample ob5 = new StudentExample(101,35,"Ritesh");

        TreeSet<StudentExample> set = new TreeSet<>();
        set.add(ob1);
        set.add(ob2);
        set.add(ob3);
        set.add(ob4);
        set.add(ob5);

        TreeSet<StudentExample> set2 = new TreeSet<>();

        for (StudentExample s: set){
            if (s.getAge() > 20){
                set2.add(s);
            }
        }
        for (StudentExample s2 : set2){
            System.out.println(s2);
        }

    }
}
