import java.util.*;
public class DP_01KnapsackProblem
{
    static int Knapsack(int[] weight, int[] profit, int capacity)
    {
       if(weight.length == 0 || profit.length == 0 || capacity <= 0)
       {
           return 0;
       }
    
       int[][] A = new int[weight.length][capacity+1];
    
       for(int j=0;j<=capacity;j++)
       {
            if(weight[0] <= j)
            {
                A[0][j] = profit[0];
            }
        }
    
        for(int i=1;i<weight.length;i++)
        {
            for(int j=1;j<=capacity;j++)
            {  
                int includingProfit = 0;
            
                if(weight[i] <= j)
                {
                    includingProfit = profit[i] + A[i-1][j-weight[i]];
                }
            
                A[i][j] = Math.max(includingProfit , A[i-1][j]);
            }
        }
    
        return A[weight.length-1][capacity];
    }    
    
    public static void main(String[] args) 
    {
        int[] weight = {1, 2, 3, 4};
        int[] profit = {1, 4, 6, 12};
        int capacity = 8;
        System.out.println(Knapsack(weight, profit, capacity));
    }
}
