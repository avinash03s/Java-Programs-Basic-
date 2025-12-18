package Serialization_Deserialization;

import javax.imageio.IIOException;
import java.io.*;

class Student implements Serializable{
    private String name;
    private int rollNo;

    Student(String name, int rollNo){
        this.name= name;
        this.rollNo=rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
    }
}
public class SerializationExample {

    public static void main(String[] args) {
        Student ob = new Student("Avinash",264);

        try {
            FileOutputStream file = new FileOutputStream("student.ser");
            ObjectOutputStream objfile = new ObjectOutputStream(file);

            {
                objfile.writeObject(ob);
                System.out.println("Student object has been serialized.");
            }
        }catch (IIOException | FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
