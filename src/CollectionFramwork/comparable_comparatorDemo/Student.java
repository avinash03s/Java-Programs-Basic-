package CollectionFramwork.comparable_comparatorDemo;

public class Student implements Comparable<Student> {
    private int id;
    private int age;
    private String firstName;
    private String lastName;

    public Student(int id, int age, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    /// sorting by id
    @Override
    public int compareTo(Student s) {
        return this.getId() - s.getId();
    }

    /// sorting by age
//    @Override
//    public int compareTo(Student s) {
//        return this.getAge() - s.getAge();
//    }

    ///  sorting by First Name
//    @Override
//    public int compareTo(Student o) {
//        return this.getFirstName().compareTo(o.getFirstName());
//    }


    /// sorting by Last Name
//    @Override
//    public int compareTo(Student o) {
//        return this.getLastName().compareTo(o.getLastName());
//    }
}
