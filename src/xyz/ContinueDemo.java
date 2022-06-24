package xyz;

public class ContinueDemo {

    public static void main(String[] args) {

        for(int i = 1; i <=10; i++) {


            System.out.println("Hello from Iteration Number : " +i);


            if(i == 5){
                continue;
            }

            System.out.println("hi from iteration number :" +i);

            System.out.println("******************************");

        }
    }
}
