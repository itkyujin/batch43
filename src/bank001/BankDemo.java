package bank001;
import bank001.Bank;
import bank001.RbcBank;

public class BankDemo {

    public static void main(String[] args){
        bank001.Bank d = new RbcBank();
    }

    public static void consume(Bank bank) {
        bank.calculateInterest();
        int i = bank.calculateInterest();
    }
}
