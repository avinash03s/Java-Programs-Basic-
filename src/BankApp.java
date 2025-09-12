public class BankApp{
    public static void main(String[]args){
        Account ob= new Account();
        ob.setaccountHolder("Avinash" , 1234 , 100000.0);
        ob.getaccountHolder();
    }

}

class Account{
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public void setaccountHolder(String a1,int aN1,double b1){
        accountHolder=a1;
        accountNumber=aN1;
        balance=b1;
    }

    public void getaccountHolder(){
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);

    }

}