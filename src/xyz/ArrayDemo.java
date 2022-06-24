package xyz;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

int [][] arr = new int[4][3];

for (int i = 0; i < 4; i++){
    //task -- fill in i's th row

    for(int j = 0; j < 3; j++){
        arr[i][j] = 10;

    }
}
int total;
for (int i = 0; i < 4; i++){
    total = 0;

    for(int j = 0; j < 3; j++){
        System.out.print(arr[i][j]+"\t");
        total = total+arr[i][j];
    }
    System.out.print(">>>>>>>>>>> " +total);
    System.out.println();
}

/*

        for (int i = 0; i < 4; i++){
            total = 0;
            for(int j = 0; j < 3; j++){
                total = total+arr[i][j];
            }
            System.out.println("Total of Student no " +(i+1) + "= " + total);
        }
*/


/*
    int x = 10;
        System.out.println(x);

        int[] arr1 = new int[4];

        int[] arr = new int[10];

        for(int i =0; i < arr.length; i++) {
            arr[i]= i+1;
        }

        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);

        }


        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter student's score :");
        x = sc.nextInt();


        int[] arr3 = new int[5];
        System.out.println("Student's Score is : " +x);


        System.out.println("Please enter student's multiple score :");
        int[] y = new int[5];
        for(int i=0; i<y.length; i++) {
            System.out.println(y);
        }

        System.out.println("student's Multiple Score are :" + y);
*/

    }
}
