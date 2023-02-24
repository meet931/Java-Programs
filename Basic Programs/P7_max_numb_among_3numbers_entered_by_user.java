import java.util.Scanner;

public class P7_max_numb_among_3numbers_entered_by_user {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("Enter c : ");
        int c = sc.nextInt();

        if(a > b)
        {
            if(a > c)
            {
                System.out.println("a is max.");
            }
        }
        else if(b > c)
        {
            if(b > a)
            {
                System.out.println("b is max.");
            }
        }
        else if(a == b && b == c && a == c)
        {
            System.out.println("a, b and c are equal.");
        }
        else 
        {
            System.out.println("c is max.");
        }
    }
}
