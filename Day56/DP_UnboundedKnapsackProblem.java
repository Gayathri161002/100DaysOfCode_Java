import java.util.*;
public class DP_UnboundedKnapsackProblem
{
    static int unboundedKnapsack(int[] weight, int[] profit, int capacity)
    {
       if(weight.length == 0 || profit.length == 0 || capacity <= 0)
       {
           return 0;
       }
    
       int[][] A = new int[weight.length][capacity+1];

        for(int i=1;i<weight.length;i++)
        {
            for(int j=1;j<=capacity;j++)
            {  
                int includingProfit = 0;
                int excludingProfit = 0;
            
                if(weight[i] <= j)
                {
                    includingProfit = profit[i] + A[i][j-weight[i]];
                }
                if(i > 0)
                {
                    excludingProfit = A[i-1][j];
                }
            
                A[i][j] = Math.max(includingProfit , excludingProfit);
            }
        }
    
        return A[weight.length-1][capacity];
    }    
    
    public static void main(String[] args) 
    {
        int[] weight = {1, 2, 3, 5};
        int[] profit = {1, 4, 10, 10};
        int capacity = 8;
        System.out.println(unboundedKnapsack(weight, profit, capacity));
    }
}