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

    void calculateBalance(double withdrawAmount,double balance){

        double remainingBalance=balance-withdrawAmount;

        System.out.println("WithdrawAmount : "+withdrawAmount);
        System.out.println("Available Balance : "+remainingBalance);
    }

   /* void calculateBalance(double amount){
        balance=amount;
        System.out.println("Amount : "+amount);

    }
*/
}

public class BankApp {
    public static void main(String[] args) {
        Account ob= new Account();
        ob.setAccountHolder("Avinash",23049835,10000000.0);
        ob.getAccountHolder();
        ob.calculateBalance(5000.0, 10000000.0);
       // ob.calculateBalance(30000.0);

    }
}
