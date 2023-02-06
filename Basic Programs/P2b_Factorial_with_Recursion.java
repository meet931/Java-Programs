import java.util.Scanner;

public class P2b_Factorial_with_Recursion {
    
    static int factorial(int n) {
        if(n == 0) 
            return 1;
        else
            return n * factorial(n -1);
    }

    public static void main(String[] args) {
        int n, fact = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        n = sc.nextInt();

        fact = factorial(n);
        System.out.println(n + "! = " + fact); 
    }
}
