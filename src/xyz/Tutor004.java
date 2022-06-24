package xyz;

public class Tutor004 {
    public static void main(String[] args) {

        System.out.println(sum(5));

        }

    public static int sum(int lastNum) {

        // 0, 1, 4, 9, 16, 25,
        // 6! = 6 * 5 * 4 * 3 * 2 * 1
        int x = 1;
        int sum = 1;

/*
        while (lastNum >= x){
            sum += x;

            x++;
        }
*/
            for (x = 1; x <= lastNum; x++) {
                sum *= x;
            }
            return sum;
        }





}





/*
------------------------------------------------------------------------------------------------------------------------
        factorial problem.
 */
// */
        //2. Create the number guessing game. Add extension to it for giving hints for lesser or greater.
        //3. Create switch block for printing number of days in each month.
//*/
