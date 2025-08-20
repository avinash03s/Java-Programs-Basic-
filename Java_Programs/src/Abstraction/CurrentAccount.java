package Abstraction;

import java.util.Scanner;

abstract class BankAccount{
    abstract void withdraw();
}
class SavingAccount extends BankAccount{
    @Override
    void withdraw() {
        System.out.println("Payment Successful withdraw form your Saving Account");
    }
}
public class CurrentAccount extends BankAccount {
    @Override
    void withdraw() {
        System.out.println("Payment Successful withdraw form your Current Account");
    }

    public static void main(String[] args) {

        SavingAccount ob=new SavingAccount();
        CurrentAccount ob1= new CurrentAccount();

                ob.withdraw();

                ob1.withdraw();

            }

    }

