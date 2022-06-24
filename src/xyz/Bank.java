package xyz;

public abstract class Bank {
    private String name;
    private String branch;
    private String rate;

    public abstract void calculateRate();

}

class TDBank extends Bank {

    private String codeTd;

    @Override
    public void calculateRate() {
        System.out.println(2.5);
    }
}

class RBCBank extends Bank {

    private String codeRBC;

    @Override
    public void calculateRate() {
        System.out.println(4.6);
    }
}