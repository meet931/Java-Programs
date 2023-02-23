// Prime numbers are those which are divisable by 1 and itself.
// Ex. 2, 3, 5, 7, 11, 13, .....

public class P6_Prime_Number {
    public static void main(String[] args)
    {
        int num = 7;
        int counter = 0;

        // loop for checking the number is divisable by any number in given range
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                counter++;
            }
        }

        if(counter == 2)  // num can be divisable by 1 and itself.
        {
            System.out.println("Number is Prime.");
        }
        else
        {
            System.out.println("Number is not Prime.");
        }

    }
}
