package HasA_Rele;

public class Customer {
   // private String name;
    private String address;
    private String phoneNumber;
    private String aadharId;
    private Account account;

    Customer(String address,String phoneNumber,String aadharId,Account account ){
        //this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.aadharId=aadharId;
        this.account=account;
    }
    public String getCustomerInfo(){
        return account.getAccountInfo()+"\n"+"Address: "+address+"\n"+"PhoneNumber: "+phoneNumber+"\n"+"AddharId: "+aadharId+"\n";
    }

}
class Main1{
    public static void main(String[] args) {
        Account ob=new Account("12345","Avinash Surwase",50000.0);
        Customer ob1= new Customer("MH23 Beed","8767622435","787191322396",ob);
        System.out.println(ob1.getCustomerInfo());
    }
}
