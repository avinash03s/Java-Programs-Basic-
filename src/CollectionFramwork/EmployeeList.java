package CollectionFramwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

    private int id;
    private int age;
    private String firstname;
    private String lastname;
    private String address;

    public EmployeeList() {
    }

    public EmployeeList(int id, int age, String firstname, String lastname, String address) {
        this.id = id;
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeList{" +
                "id=" + id +
                ", age=" + age +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class SortById implements Comparator<EmployeeList> {

    @Override
    public int compare(EmployeeList o1, EmployeeList o2) {
        return o1.getId() - o2.getId();
    }
}

class SortedByAge implements Comparator<EmployeeList> {

    @Override
    public int compare(EmployeeList o1, EmployeeList o2) {
        return o1.getAge() - o2.getAge();
    }
}

class SortedByFName implements Comparator<EmployeeList> {

    @Override
    public int compare(EmployeeList o1, EmployeeList o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }
}

class SortedByLName implements Comparator<EmployeeList> {

    @Override
    public int compare(EmployeeList o1, EmployeeList o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}

class SortedByAddress implements Comparator<EmployeeList> {

    @Override
    public int compare(EmployeeList o1, EmployeeList o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}


class EmployeeMain {

    public static void main(String[] args) {
        EmployeeList emp1 = new EmployeeList(101, 25, "Balaji", "Kale", "Kej");
        EmployeeList emp2 = new EmployeeList(105, 21, "Pramod", "Maske", "Gavlwadi");
        EmployeeList emp3 = new EmployeeList(103, 20, "Avinash", "Surwase", "Beed");
        EmployeeList emp4 = new EmployeeList(104, 22, "Tejas", "Gire", "Mumbai");
        EmployeeList emp5 = new EmployeeList(102, 15, "Samarth", "Kalkute", "Pendgav");
        EmployeeList emp6 = new EmployeeList(107, 15, "Sushil", "Dhage", "Siras");
        EmployeeList emp7 = new EmployeeList(106, 15, "Avinash", "Kakde", "Jalna");

        List<EmployeeList> list = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7);
        Collections.sort(list, new SortById());
        System.out.println("Sorted BY Id");
        for (EmployeeList e : list) {
            System.out.println(e);
        }

        System.out.println("------------------------------------------");
        Collections.sort(list, new SortedByAge());
        System.out.println("Sorted BY Age");
        for (EmployeeList e : list) {
            System.out.println(e);
        }

        System.out.println("------------------------------------------");
        Collections.sort(list, new SortedByFName());
        System.out.println("Sorted BY FirstName");
        for (EmployeeList e : list) {
            System.out.println(e);
        }

        System.out.println("------------------------------------------");
        Collections.sort(list, new SortedByLName());
        System.out.println("Sorted BY LastName");
        for (EmployeeList e : list) {
            System.out.println(e);
        }

        System.out.println("------------------------------------------");
        Collections.sort(list, new SortedByAddress());
        System.out.println("Sorted BY Address");
        for (EmployeeList e : list) {
            System.out.println(e);
        }
        System.out.println("------------------------------------------");

    }
}
