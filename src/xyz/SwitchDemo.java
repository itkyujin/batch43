package xyz;

public class SwitchDemo {

    public static void main(String[] args) {
        // place 12 ifs linearly
        // place 12 if else if else if else if....... else ... horizontally

        int month = 12;

        // ternary operator ? :

        if(month>2){} else{}

        System.out.println("ds");

        System.out.println();

        int x = month>2 ?  3 : 7;

/*
        2 *   =
        2 *   =
*/


        System.out.println("2");

        System.out.println("my number is " + x + " and my marks are : " +76);



        switch(month){
            case 1:
                break;

            case 3:
                System.out.println("31");
                break;
            case 2:
                System.out.println("feb");
                break;

            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("jan");
                break;

            case 9:
                System.out.println("jan");
                break;

            case 10:
                System.out.println("jan");
                break;

            case 11:
                System.out.println("jan");
                break;

            case 12:
                System.out.println("jan");
                break;

            default:
                System.out.println("worng input");

        }
    }
}
