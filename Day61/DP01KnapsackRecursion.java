public class DP01KnapsackRecursion
{
    static int knapsack(int[] weight,int[] profit,int capacity,int n)
    {
        if(n == 0 || capacity == 0)
        {
            return 0;
        }
        
        if(capacity < weight[n])
        {
            return knapsack(weight,profit,capacity,n-1);
        }
        
        else 
        {
            int includingCapacity = profit[n] + knapsack(weight, profit, capacity-weight[n], n-1);
            int excludingCapacity = knapsack(weight, profit, capacity, n-1);
            
            return Math.max(includingCapacity, excludingCapacity);
        }
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