package Encapuslation;

class Account{
   private String accountHolder;
   private int accountNumber;
    private double balance;

    public void setAccountHolder(String a1, int aN, double b) {
        accountHolder = a1;
        accountNumber=aN;
        balance=b;
    }

    public void getAccountHolder() {
        System.out.println("AccountHolderName : "+accountHolder);
        System.out.println("AccountNumber : "+accountNumber);
        System.out.println("Balance : "+balance);
       // return accountHolder;

    }
}

public class BankApp {
    public static void main(String[] args) {
        Account ob= new Account();
        ob.setAccountHolder("Avinash",23049835,10000000.0);
        ob.getAccountHolder();

    }
}
