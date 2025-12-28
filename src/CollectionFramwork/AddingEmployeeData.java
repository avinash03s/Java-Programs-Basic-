package CollectionFramwork;

import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String address;

    Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    Employee() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    void showDetail(List<Employee> list) {
        System.out.println("Employee Details: ");
        for (Employee e : list) {
            System.out.println("Employee Id: " + e.getId());
            System.out.println("Employee Name: " + e.getName());
            System.out.println("Employee Address: " + e.getAddress());
            System.out.println("\n");
        }
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.getId();
    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        return
//    }
}

public class AddingEmployeeData {

    public static void main(String[] args) {
        Employee ob1 = new Employee(4, "Karan", "Beed");
        Employee ob2 = new Employee(3, "Rahul", "Pune");
        Employee ob3 = new Employee(2, "Ram", "Mumbai");
        Employee ob4 = new Employee(1, "Sham", "Nagar");
        Employee ob5 = new Employee(5, "Harsh", "Beed");

        List<Employee> list = new ArrayList<>();
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);
        list.add(ob5);

        Employee employee = new Employee();
//        employee.showDetail(list);
        Collections.sort(list, new CompareEmployee());

        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
