import java.util.Scanner;

public class P5_evenOdd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int no = sc.nextInt();

        if(no % 2 == 0)
        {
            System.out.println("Even Number.");
        }
        else {
            System.out.println("Odd Number.");
        }
    }
}
