package Serialization_Deserialization;

//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.Serializable;
//
//class Employ implements Serializable{
//
//    private String name;
//    private int id;
//
//    Employ(String name , int id){
//        this.name= name;
//        this.id= id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    void display(){
//        System.out.println("Name: "+name);
//        System.out.println("Id: "+id);
//    }
//}
//public class DeserializationExample {
//
//    public static void main(String[] args) {
//        Employ obj = new Employ("Avinash",45);
//        try (
//            FileInputStream fileInputStream = new FileInputStream("employ.ser");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        )
//        {
//            Employ ob = (Employ) objectInputStream.readObject();
//            System.out.println("Student object has been deserialized.");
//            ob.display();
//        }catch (IOException | ClassCastException | ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }
//}
