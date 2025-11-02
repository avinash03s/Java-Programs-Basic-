package HasA_Rele;

import java.util.Scanner;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    Address(String street,String city,String state,String zipCode){
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
    }

    public String getAddress(){
        return street+", "+city+", "+state+", "+zipCode;
    }
}
class Person{
    private String name;
    private Address address;
    Person(String name,Address address){
        this.name=name;
        this.address=address;
    }
    public String getPerson(){
        return "Name: "+ name +"Address: "+address.getAddress();
    }
}
class Main{
    public static void main(String[] args) {
        Address ob=new Address("MH23","Beed","Maharashtra","431122");
        Person ob1= new Person("Avinash Surwase \n",ob);
        int id=101;
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter Id Number: ");
            int enterId = sc.nextInt();
            if (enterId == id) {
                System.out.println(ob1.getPerson());
                System.exit(0);
            } else {
                System.out.println("Invalid Id...");
                System.out.println("--------------------");
            }
        }
    }
}
