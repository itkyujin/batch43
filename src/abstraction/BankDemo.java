package abstraction;
import java.util.ArrayList;
import java.util.List;

public class BankDemo {
    public static void main(String[] args){
        Bank d = new RbcBank();


    }

    public static void consume(Bank bank) {
        bank.calculateInterest();
        int i = bank.calculateInterest();


    }

}
