package Encapuslation;

public class BankAccount {
    private String accHolderName;
    private String aadhaarId;
    private double balance;

    public void setAccHolderName(String accHolderName,String aadhaarId,double balance){
        this.accHolderName=accHolderName;
        this.aadhaarId=aadhaarId;
        this.balance=balance;
    }

    public void getAccHolderName() {
        System.out.println("AccountHolder: "+accHolderName);
        System.out.println("AadhaarId: "+aadhaarId);
        System.out.println("Balance: "+balance);
    }

}
class AccountHolder extends BankAccount{
    public static void main(String[] args) {
        AccountHolder ob1= new AccountHolder();
        ob1.setAccHolderName("Avinash","1234 5678 9123",1000000.0);
        ob1.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //2
        AccountHolder ob2= new AccountHolder();
        ob2.setAccHolderName("Rohit Sharma","8927 3376 8362",100.0);
        ob2.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //3
        AccountHolder ob3= new AccountHolder();
        ob3.setAccHolderName("MS Dhoni","3875 3864 9833",5000.0);
        ob3.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //4
        AccountHolder ob4= new AccountHolder();
        ob4.setAccHolderName("KL Rahul","8374 8787 8475",3333.0);
        ob4.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //5
        AccountHolder ob5= new AccountHolder();
        ob5.setAccHolderName("Surya","6666 7678 9976",55500.0);
        ob5.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //6
        AccountHolder ob6= new AccountHolder();
        ob6.setAccHolderName("Virat","7736 2544 2361",444600.0);
        ob6.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //7
        AccountHolder ob7= new AccountHolder();
        ob7.setAccHolderName("Rohit","3736 2822 8383",46444.0);
        ob7.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //8
        AccountHolder ob8= new AccountHolder();
        ob8.setAccHolderName("Rahul","8873 7773 9993",59999.0);
        ob8.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //9
        AccountHolder ob9= new AccountHolder();
        ob9.setAccHolderName("Karan","3873 2623 7272",80000.0);
        ob9.getAccHolderName();
        System.out.println("-------------------------------------------------------------------");
        //10
        AccountHolder ob10= new AccountHolder();
        ob10.setAccHolderName("Rama","7638 2918 3532",99999.0);
        ob10.getAccHolderName();
    }
}
