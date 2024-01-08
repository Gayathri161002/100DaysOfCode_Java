import java.util.*;
public class DP_MinCoinChangeProblem
{
    static int minCoinChange(int[] coins,int sum)
    {
       if(coins.length == 0 || sum == 0)
       {
           return 0;
       }
       
       int[][] A = new int[coins.length][sum+1];
       
       for(int i=0;i<coins.length;i++)
       {
           A[i][0] = 0;
       }
    
        for(int i=0;i<coins.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {  
                int includingCoin = Integer.MAX_VALUE;
                int excludingCoin = Integer.MAX_VALUE;
            
                if(coins[i] <= j)
                {
                    includingCoin = 1 + A[i][j-coins[i]];
                }
                if(i > 0)
                {
                    excludingCoin = A[i-1][j];
                }
            
                A[i][j] = Math.min(includingCoin , excludingCoin);
            }
        }
    
        return A[coins.length-1][sum];
    }    
    
    public static void main(String[] args) 
    {
        int[] coins = {1, 2, 3};
        int sum = 5;
        System.out.println(minCoinChange(coins,sum));
    }
}