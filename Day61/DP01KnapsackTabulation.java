import java.util.*;
public class DP01KnapsackTabulation
{
    static int Knapsack(int[] weight, int[] profit, int capacity)
    {
       if(weight.length == 0 || profit.length == 0 || capacity <= 0)
       {
           return 0;
       }
    
       int[][] dp = new int[weight.length][capacity+1];
    
       for(int j=0;j<=capacity;j++)
       {
            if(weight[0] <= j)
            {
                dp[0][j] = profit[0];
            }
        }
    
        for(int i=1;i<weight.length;i++)
        {
            for(int j=1;j<=capacity;j++)
            {  
                int includingProfit = 0;
            
                if(weight[i] <= j)
                {
                    includingProfit = profit[i] + dp[i-1][j-weight[i]];
                }
                
                int excludingProfit = dp[i-1][j];
                dp[i][j] = Math.max(includingProfit , excludingProfit);
            }
        }
    
        return dp[weight.length-1][capacity];
    }    
    
    public static void main(String[] args) 
    {
        int[] weight = {1, 4, 3};
        int[] profit = {2, 5, 4};
        int capacity = 7;
        System.out.println(Knapsack(weight, profit, capacity));
    }
}