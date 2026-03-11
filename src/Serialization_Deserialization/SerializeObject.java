package Serialization_Deserialization;

import java.io.*;

class User implements Serializable {

    private String name;
    private int age;
    private String city;
    private String pinCode;

    public User(String name, int age, String city, String pinCode) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}


public class SerializeObject {

    public static void main(String[] args) {
        User ob = new User("Avinash",21,"Beed","431122");
        String fileName = "user.ser";

        try (FileOutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fileOut)){

            out.writeObject(ob);
            System.out.println("Object serialized successfully and saved in " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class DeserializeObject{
    public static void main(String[] args) {
        String fileName = "user.ser";

        try (FileInputStream fileInput = new FileInputStream(fileName);
        ObjectInputStream input = new ObjectInputStream(fileInput)){
             User o = (User) input.readObject();
            System.out.println("Object Deserialized successfully: " + o);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

//step 1 - Implement the Serializable Interface
//step 2 - Create FileInputStream object for store serialize object
//step 3 - Create Object of ObjectOutputStream
//step 4 - Call the writeObject(Object obj) method of the ObjectOutputStream to write the object to the output stream
//step 5 -  Must handle IOException using try-catch blocks


//step 1 - Implement the Serializable Interface
//step 2 - Create Object of ObjectInputStream
//step 3 - call readObject() method
//step 4 - must handle IOException using try-catch block