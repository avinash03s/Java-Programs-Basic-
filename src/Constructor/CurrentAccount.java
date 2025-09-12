package Constructor;

class BankAccount{
    int accountNumber;
    double balance;

    BankAccount(){
        System.out.println("Account Not created");
    }

    BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
}
class SavingAccount extends BankAccount{
    SavingAccount(){
        super();
        System.out.println("SavingAccount Created..");
    }
    SavingAccount(int accountNumber,double balance,double interestRate){
        this();
        System.out.println("Your AccountNumber: "+accountNumber);
        System.out.println("Your Balance: "+balance);
        System.out.println("InterestRate: "+interestRate);
        System.out.println("------------------");
    }
}


public class CurrentAccount extends BankAccount {
    CurrentAccount(){
        super();
        System.out.println("CurrentAccount Created..");
    }

    CurrentAccount(int accountNumber,double balance,double overdraftLimit){
        this();
        System.out.println("AccountNumber: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("OverDraft Limit");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        SavingAccount ob1= new SavingAccount(101,100000,5.0);
        CurrentAccount ob= new CurrentAccount(102,50000,20000);
    }
}
