package Constructor;

class Person{
   String name;
   int age;
   Person(){
       name="unknown";
       age=0;
       System.out.println("Person Name:"+name);
       System.out.println("Person age"+age);
   }
   Person(String name,int age){
       this.name=name;
       this.age=age;
       System.out.println("Person Name:"+name);
       System.out.println("Person age"+age);
   }
}
class Student extends Person{
    Student(){
        super();
        System.out.println("Not Assigned");
    }
    Student(String name,int age,String course){
        this();
        System.out.println("Student: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
    }
}

public class Teacher extends Person {
    Teacher(){
        super();
        System.out.println("none");
    }
    Teacher(String name,int age,String subject){
        this();
        System.out.println("Teacher name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+subject);
    }

    public static void main(String[] args) {
        Teacher ob= new Teacher("Sahil",35,"HTML");
        Student ob1= new Student("Avinash",21,"Java");
    }
}
