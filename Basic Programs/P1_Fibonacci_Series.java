/* Fibonacci Series : 0     1       1       2       3       5       8  
   
   0 + 1 = 1
   1 + 1 = 2
   2 + 1 = 3 .....
*/

import java.util.Scanner;

public class P1_Fibonacci_Series {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to print : ");
        int n = sc.nextInt();

        fibonacci(a, b, n);
    }

    static void fibonacci(int a, int b, int n) {
        if(n < 0) {
            System.out.println("Entered invalid number.");
        }
        else if(n == 0) {
            System.out.println(n);
        }
        else {
            System.out.println(a);
            System.out.println(b);

            for(int i = 2; i < n; i++) {  // loop starts from 2 because 0 and 1 already present
                int c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }

        }

    }
}