package Encapuslation;
class Cat{
   private String name;//data hiding;

    public void setName(String n1) {
        name = n1;
    }

    public String getName() {
        System.out.println("Cat Name is : "+name);
        return name;
    }
}

public class Animal extends Cat{
    public static void main(String[] args) {
        Animal ob= new Animal();
        ob.setName("Rama");
        ob.getName();
    }
}
