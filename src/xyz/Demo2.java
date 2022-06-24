package xyz;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

/*
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
*/

/*      int x= 1;
        while(x<=10){
            System.out.println(x);
            x++;
        }*/

/*
        if (month ==1 || month == 3 || month == 5 || month == 7) {
            System.out.println("31 days");
        } else if (month ==4 || month == 5){
            System.out.println("30 days");
        }
        else {
            System.out.println("28 days");
        }
*/


        int magicNo = 30;
        Scanner sc = new Scanner(System.in);

        int r = 3;
        do{
            System.out.println("oops");
        }
        while(r<0);

        while(true) {
            System.out.println("Make a guess of my magic no (1-100)....");
            int guessedNo = sc.nextInt();

            if(guessedNo == magicNo){
                System.out.println("congrats..correct guess");
                break;
            }
            else {
                System.out.println("sorry.. try another no.......");
                if(guessedNo > magicNo ){
                    System.out.println("Your Number is Big");
                }
                else if(guessedNo < magicNo) {
                    System.out.println("Your Number is Small");

                }
            }
        }
        System.out.println("game ends");
    }
}