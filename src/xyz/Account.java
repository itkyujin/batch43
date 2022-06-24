package xyz;

public class Account {

    private static final String BRANCH= "ABC Branch";

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        System.out.println("Account opened successfully");
    }

    public static void dummyStatic(){
        System.out.println(BRANCH);
    }

    public void depositBalance(double amount) {
        balance = balance + amount;
        System.out.println(amount + "amount deposited successfully");
    }

    public double checkBalance (){
        return balance;
    }

    public void withdrawBalance(double amount) {
        System.out.println(BRANCH);
        if (balance < amount) {
            System.out.println("insufficient balance");

        } else {
            balance = balance - amount;
            System.out.println(amount + "amount withdrawn successfully");
        }
    }
}