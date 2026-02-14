package String;

import java.util.ArrayList;
import java.util.List;

final class PerformDeepCopy {

    private int id;
    private String name;
    private List<Student> list;

    PerformDeepCopy(int id, String name, List<Student> list){
        this.id=id;
        this.name= name;

        List<Student> list1 = new ArrayList<>();
        for (Student s: list){
            list1.add(new Student(s.getId(),s.getName()));
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getList(){
        List<Student> copy = new ArrayList<>();
        for (Student s : list){
            copy.add(new Student(s.getId(),s.getName()));
        }
        return copy;
    }

    public static void main(String[] args) {
        String s = "Avinash";
        String s1 = "Avinash";
        String s2 = new String("Avinash");
        String s3 = new String("Avinash");

//
//        System.out.println(s==s1); //true
//        System.out.println(s2 == s3); //false
//        System.out.println(s == s2); //false
//        System.out.println(s1 == s3); //false

        System.out.println(s.equals(s1)); //true
        System.out.println(s2.equals(s3)); //true
        System.out.println(s.equals(s2));//true
        System.out.println(s1.equals(s3)); // true
    }

}
