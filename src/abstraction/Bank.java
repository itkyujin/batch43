package abstraction;

public abstract class Bank {

    private int bankName;


    public void sayHello(){
        System.out.println("hello");
    }

    public abstract int calculateInterest();

    public abstract void calculateInterest2(int x);

    public abstract float calculateInterest3(String s);

}
