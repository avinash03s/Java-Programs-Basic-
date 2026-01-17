public class BankApp{
    public static void main(String[]args){
        Account ob= new Account();
        ob.setAccountHolder("Avinash" , 1234 , 100000.0);
        ob.getAccountHolder();
    }

}

class Account{
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public void setAccountHolder(String a1,int aN1,double b1){
        accountHolder=a1;
        accountNumber=aN1;
        balance=b1;
    }

    public void getAccountHolder(){
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);

    }

}