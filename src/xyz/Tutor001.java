package xyz;

public class Tutor001 {
    public static void main(String[] args) {
        // System.out.println(sleepIfIn(true,true));
        // System.out.println(sleepIfIn(true, false));
        // System.out.println(sleepIfIn(false, true));
        // System.out.println(sleepIfIn(false, false));

        System.out.println(diff21(25));
    }

    public static boolean sleepIfIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int diff21(int n) {
        /*if(21 - n >=0){
            return n;
        }
        else {

            return (n-21) * 2;
        }*/

        return (n <= 21)? (21-n):(n-21)*2;
    }
}



