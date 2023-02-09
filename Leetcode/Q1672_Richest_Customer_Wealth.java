public class Q1672_Richest_Customer_Wealth 
{
    public static void main(String[] args) 
    {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        System.out.println(maximumWealth(accounts));
    }
    
    // row = person     col = account
    static int maximumWealth(int[][] accounts) 
    {
        int ans = Integer.MIN_VALUE;

        for(int person = 0; person < accounts.length; person++) 
        {

            // when you start a new col, take a new sum for that
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++) 
            {
                sum += accounts[person][account];
            }

            // now we have sum of accounts of person
            // check with overall ans
            if(sum > ans)
            {
                ans = sum;
            }
        }
        return ans;
        

    }
}
