package xyz;

import java.util.Scanner;

public class MainDemo {

    private int xxx;
    public static void main(String[] args) {


        Account account = new Account(123431122L, "Kyujin");

        account.depositBalance(500.00);
        account.depositBalance(500.00);
        account.depositBalance(500.00);
        account.withdrawBalance(500.00);

        System.out.printf("Current balance is : " +account.checkBalance());

    }
}
