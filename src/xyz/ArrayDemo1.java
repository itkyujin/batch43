package xyz;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

    public static void main(String[] args) {

        int [] arr = new int[5];

        Scanner sc = new Scanner(System.in);

/*      arr[0]= sc.nextInt();
        arr[1]= sc.nextInt();
        arr[2]= sc.nextInt();
        arr[3]= sc.nextInt();
        arr[4]= sc.nextInt();
*/
        int total = 0;

//      int total = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];

        for(int i=0 ; i < 5; i++ ) {
            arr[i] = sc.nextInt();
        }

        for(int i =0; i < 5; i++){
            arr[i] = 10;

        }

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

/*
        for(int i =0; i < 5; i++) {
            total = total + arr[i];
        }

        System.out.println(total);

        // arr = null;
    arr = new int[3];
*/

    // char[] charr = new char[5];


    }
}