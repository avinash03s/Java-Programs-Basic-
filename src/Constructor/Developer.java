package Constructor;

class Employee{
    Employee(String name, double salary){

        System.out.println("EMP name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("-------------------");
    }

}
class Manager extends Employee{
    Manager(String name,double salary,String department){
       // this("Avinash",130000,"Computer Science")
        super("Arun",50000);
        System.out.println("Manager Name: "+name);
        System.out.println("Salary :"+salary);
        System.out.println("Department: "+department);
        System.out.println("----------------");
    }

}

public class Developer extends Employee {
    Developer(String name, double salary,String programingLanguage){
        super("Arun",40000);
        System.out.println(" Developer Name: "+ name);
        System.out.println("Salary: "+ salary);
        System.out.println("ProgramingLanguage: "+programingLanguage);
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        Developer ob= new Developer("Rahul",80000,"Java");
        Manager ob1= new Manager("Avinash",130000,"CS");
    }
}
