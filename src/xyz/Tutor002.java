package xyz;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.util.Scanner;

public class Tutor002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number 1" );
        int x = in.nextInt();
        System.out.println("Please enter a number 2" );
        int y = in.nextInt();

        // System.out.println("this is sum " + sum(x, y));
//        int z = div(x,y);
        System.out.println("this is division" + div(x,y));
    }




    public static int sum (int x, int y){

        return x + y;
    }

    public static int sub (int x, int y){

        return x - y;
    }

    public static int mul (int x, int y){

        return x * y;
    }

    public static double div (double x, double y){
        try {
             return  x / y;
        }

        catch(Exception e) {
            System.out.println(e.getMessage());

            return 0;
        }

    }

    // arr[]

    //   n * (n+1)
}
