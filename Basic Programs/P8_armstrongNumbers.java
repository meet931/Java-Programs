import java.util.Scanner;

public class P8_armstrongNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int originalNubmer = n;   // stored n in originalNumber because we have to perform some operation on n
        int remainder, sum = 0;

        while(n != 0){

            remainder = n % 10;  // ramainder = will seperate the number like 153 = 1    5     3
            /*
                3 = 153 % 10        153 = 15  3  (1st loop)
                5 = 15 % 10         15  = 1   5   (2nd loop)
                1 = 1 % 10          1   = 1              
            */

            sum = sum + remainder * remainder * remainder;
            /*
                sum = 0 + 3*3*3         (1st loop)
                sum = 27 + 5*5*5        (2nd loop)
                sum = 27 + 125 + 1*1*1  (3rd loop)

            */

            n = n / 10;   
            /*
                ----- int division -----
                        15 = 153/10
                        1 = 15/10
                        0 = 1/10  (will break condition)
            */
        }

        if(originalNubmer == sum) {
            System.out.println(originalNubmer + " is an Armstrong Number.");
        } else {
            System.out.println(originalNubmer + " is not an Armstrong Number.");
        }
    }
}
