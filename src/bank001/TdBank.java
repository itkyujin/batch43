package bank001;
import bank001.Bank;

public class TdBank extends Bank {

    @Override
    public int calculateInterest(){
        return 3;
    }

    @Override
    public void calculateInterest2(int x) {
    }

    @Override
    public float calculateInterest3(String s) {

        return 0;
    }

}