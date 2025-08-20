package Abstraction;
/*Create an abstract class called Payment that includes:
An abstract method called pay().
A constructor that prints "Payment method selected".

Create two subclasses:
CreditCardPayment → prints "Paid using Credit Card" in pay().
UPIPayment → prints "Paid using UPI" in pay().

In the main() method:
Create objects for both CreditCardPayment and UPIPayment.
Call their pay() methods.*/

abstract class Payment {
    Payment(){
        System.out.println("Payment method selected");
    }
    abstract void pay();
}
class PaymentMethodSelected extends Payment{
    PaymentMethodSelected(){

    }

    @Override
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}
class UPIPayment extends Payment{
    UPIPayment(){


    }

    @Override
    void pay() {
        System.out.println("Paid Using UPI");
    }

    public static void main(String[] args) {
        PaymentMethodSelected ob=new PaymentMethodSelected();
        ob.pay();

        UPIPayment ob1= new UPIPayment();
        ob.pay();
    }
}
