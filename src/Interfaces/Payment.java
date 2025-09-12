package Interfaces;

import java.util.Scanner;

public interface Payment {
    void pay();
}
class UpiPayment implements Payment {
   @Override
    public void pay() {
        System.out.println("Your Payment done using UPI");
    }
}
class NetBankingPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Your Payment done using Net Banking");
    }
}
class Loan implements Payment{
    @Override
    public void pay() {
        System.out.println("Your loan is done ");
    }
}
class PaymentCheckout{
    void payment(Payment payment){
        payment.pay();
    }


}
class MainApp{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        PaymentCheckout ob= new PaymentCheckout();
        int choice;
        do {

            System.out.println("Chose Payment Method: ");
            System.out.println("1. UPI");
            System.out.println("2. NetBanking");
            System.out.println("3. Lone Approval");
            System.out.println("Enter Your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ob.payment(new UpiPayment());
                    break;
                case 2:
                    ob.payment(new NetBankingPayment());
                    break;
                case 3:
                    ob.payment(new Loan());
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (choice!=4);
    }
}
