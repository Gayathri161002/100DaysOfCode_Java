public class Greedy_BuyAndSell
{
    static int maxProfit(int[] prices)
    {
        int len = prices.length;
        int profit = 0;
        for(int i=1;i<len;i++)
        {
            if(prices[i] > prices[i-1])
            {
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
    public static void main(String args[]) 
    {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
