package xyz;

public class Calculator {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2,4));
    }

    public int add(int a, int b) {
        return a + b;
    }
}
