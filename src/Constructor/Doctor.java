package Constructor;

import javax.print.Doc;

class Person4{
    String name;
    int age;
    Person4(){
        System.out.println("Person not registered");
    }

    Person4(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Person registered: "+name+age);
    }
}
class Patient extends Person4{
    Patient(){
        super();
        System.out.println("Patient not created");
    }

    Patient(String name,int age, String disease){
        this();
        System.out.println("Patient Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Disease: "+disease);
        System.out.println("--------------------");
    }
}
public class Doctor extends Person4 {
    Doctor(){
        super();
        System.out.println("Doctor Not created");
    }
    Doctor(String name, int age, String specialization){
        this();
        System.out.println("Doctor Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Specialization: "+specialization);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Doctor ob=new Doctor("Dr.Harsh",45,"Heart Specialist");
        Patient ob1=new Patient("Mr.Ram",35,"HeartAttack");
    }
}
