package Encapuslation;

public class BankAccount {
    private String accHolderName;
    private String aadhaarId;
    private double balance;

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public void setAadhaarId(String aadhaarId) {
        this.aadhaarId = aadhaarId;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void getAccHolderName() {
        System.out.println("AccountHolder: "+accHolderName);
    }
    public void getAadhaarID(){
        System.out.println("AadhaarId: "+aadhaarId);
    }
    public void getBalance() {
        System.out.println("Balance: "+balance);
    }
}
class AccountHolder extends BankAccount{
    public static void main(String[] args) {
        AccountHolder ob1= new AccountHolder();
        ob1.setAccHolderName("Avinash");
        ob1.setAadhaarId("7777 2757 2765");
        ob1.setBalance(375894.0);
        ob1.getAccHolderName();
        ob1.getAadhaarID();
        ob1.getBalance();
        System.out.println("-------------------------------------------------------------------");
        //2
        AccountHolder ob2= new AccountHolder();
        ob2.setAccHolderName("Rohit Sharma");
        ob2.setAadhaarId("2737 3765 8263");
        ob2.setBalance(363527.0);
        ob2.getAccHolderName();
        ob2.getAadhaarID();
        ob2.getBalance();
        System.out.println("-------------------------------------------------------------------");
        //3
        AccountHolder ob3= new AccountHolder();
        ob3.setAccHolderName("MS Dhoni");
        ob3.setAadhaarId("3765 3664 8274");
        ob3.setBalance(38647.0);
        ob3.getAccHolderName();
        ob3.getAadhaarID();
        ob3.getBalance();
        ob3.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //4
        AccountHolder ob4= new AccountHolder();
        ob4.setAccHolderName("KL Rahul");
        ob4.setAadhaarId("2837 3627 8273");
        ob4.setBalance(10000.0);
        ob4.getAccHolderName();
        ob4.getAadhaarID();
        ob4.getBalance();
        ob4.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //5
        AccountHolder ob5= new AccountHolder();
        ob5.setAccHolderName("Surya");
        ob5.setAadhaarId("0983 2873 8374");
        ob5.setBalance(40000.0);
        ob5.getAccHolderName();
        ob5.getAadhaarID();
        ob5.getBalance();
        ob5.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //6
        AccountHolder ob6= new AccountHolder();
        ob6.setAccHolderName("Virat");
        ob6.setAadhaarId("2098 2873 8273");
        ob6.setBalance(363527.0);
        ob6.getAccHolderName();
        ob6.getAadhaarID();
        ob6.getBalance();
        ob6.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //7
        AccountHolder ob7= new AccountHolder();
        ob7.setAccHolderName("Rohit");
        ob7.setAadhaarId("1009 8298 9827");
        ob7.setBalance(8788.9);
        ob7.getAccHolderName();
        ob7.getAadhaarID();
        ob7.getBalance();
        ob7.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //8
        AccountHolder ob8= new AccountHolder();
        ob8.setAccHolderName("Rahul");
        ob8.setAadhaarId("3874 3874 2763");
        ob8.setBalance(38744.0);
        ob8.getAccHolderName();
        ob8.getAadhaarID();
        ob8.getBalance();
        ob8.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //9
        AccountHolder ob9= new AccountHolder();
        ob9.setAccHolderName("Karan");
        ob9.setAadhaarId("9722 9717 9122");
        ob9.setBalance(10000.0);
        ob9.getAccHolderName();
        ob9.getAadhaarID();
        ob9.getBalance();
        ob9.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //10
        AccountHolder ob10= new AccountHolder();
        ob10.setAccHolderName("Rama");
        ob10.setAadhaarId("2837 3863 3636");
        ob10.setBalance(88444.0);
        ob10.getAccHolderName();
        ob10.getAadhaarID();
        ob10.getBalance();
        ob10.getAccHolderName();
    }
}
