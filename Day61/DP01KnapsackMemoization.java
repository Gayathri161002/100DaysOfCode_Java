import java.util.*;
public class DP01KnapsackMemoization
{
    static int[][] dp;
    static int knapsack(int[] weight,int[] profit,int capacity,int n)
    {
        dp = new int[n+1][capacity+1];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }
        
        return knapsackHelper(weight,profit,capacity,n);
    }
    
    static int knapsackHelper(int[] weight,int[] profit,int capacity,int n)
    {
        if(n == 0 || capacity == 0)
        {
            return 0;
        }
        
        if (dp[n][capacity] != -1) 
        {
            return dp[n][capacity];
        }
        
        if(capacity < weight[n])
        {
            dp[n][capacity] = knapsackHelper(weight,profit,capacity,n-1);
        }
        
        else 
        {
            int includingCapacity = profit[n] + knapsackHelper(weight, profit, capacity-weight[n], n-1);
            int excludingCapacity = knapsackHelper(weight, profit, capacity, n-1);
            
            dp[n][capacity] = Math.max(includingCapacity, excludingCapacity);
        }
        
        return dp[n][capacity];
    }
    
    public static void main(String args[]) 
    {
        int[] weight = {1, 4, 3};
        int[] profit = {2, 5, 4};
        int capacity = 7; 
        int n = weight.length - 1;
        System.out.println(knapsack(weight,profit,capacity,n));
    }
}