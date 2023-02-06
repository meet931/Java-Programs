// 5! = 5 * 4 * 3 * 2 * 1 = 120

import java.util.Scanner;

public class P2a_Factorial_without_Recursion {
    public static void main(String[] args) {
        int n, fact = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(n + "! = " + fact);
    }
}
