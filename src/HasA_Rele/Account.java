package HasA_Rele;

public class Account {
    private String accNumber;
    private String accName;
    private double balance;
    public static String bankName="Surwase Urban";

    Account(String accNumber,String accName,double balance){
        this.accNumber=accNumber;
        this.accName=accName;
        this.balance=balance;
    }
    public String getAccountInfo(){
        return "BankName: "+bankName+"\n"+"AccountHolderName: "+accName+"\n"+"AccountNumber: "+accNumber+"\n"+"Balance: "+balance;
    }
}
