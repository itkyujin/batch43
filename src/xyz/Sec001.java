package xyz;

import java.util.Scanner;

public class Sec001 {
    public static void main(String[] args) {
       int n= 5;
       // 0 1 2 3 5

/*
        if(n<=0){
            System.out.println("Please enter valid value of n");
        }

        if(n== 1){
            System.out.println(0);
        }
        if(n== 2){
            System.out.println(0);
            System.out.println(1);
        }
*/

      // 0 1 1 2 3 5
       int a = 0;
       int b = 1;

       int next ;
       for(int i = 1; i <= n; i++) {
           System.out.println(a);
           next = a+b;
           a= b;
           b= next;
       }

       int magicNumber = 30;




       Scanner sc = new Scanner(System.in);
       System.out.println("Please guess my no......................");
       int guessedNo = sc.nextInt();
       while (guessedNo!= magicNumber){
           System.out.println("sorry try again");
           guessedNo = sc.nextInt();

       }
    }
}
