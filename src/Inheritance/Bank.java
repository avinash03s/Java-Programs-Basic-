package Inheritance;

public class Bank {
    void openAccount(){
        System.out.println("Your Account is open successfully.");
    }
}
class Account extends Bank{
    void deposit(){
        System.out.println("Your Deposit is 0..");
    }
}
class SavingAccount extends Account{
    void calculateInterest(){
        System.out.println("Your Interest is 0..");
    }

    public static void main(String[] args) {
        SavingAccount ob=new SavingAccount();
        ob.openAccount();
        ob.deposit();
        ob.calculateInterest();
    }
}
