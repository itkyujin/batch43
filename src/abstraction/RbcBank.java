package abstraction;

public class RbcBank extends Bank{

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
