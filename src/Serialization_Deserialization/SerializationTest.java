package Serialization_Deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Employee {
    int id;
    String name;

    Employee (int id , String name){
        this.id= id;
        this.name=name;
    }
}
public class SerializationTest {

    public static void main(String[] args) throws Exception {
        Employee e = new Employee(101,"Avinash");
        //serialization
        FileOutputStream ob = new FileOutputStream("company.txt");
        ObjectOutputStream obj = new ObjectOutputStream(ob);
        obj.writeObject(e);
        System.out.println("serialization done..");
    }
}
