import java.util.*;
public class Greedy_MaximumToys
{
    static int maximumToys(int[] cost, int n, int k) 
    {
        Arrays.sort(cost);
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(cost[i] <= k)
            {
                count++;
                k -= cost[i];
            }
        }
        
        return count;
    }
    
    public static void main(String args[])
    {
        int cost[] = {1, 12, 5, 111, 200, 1000, 10, 9, 12, 15};
        int n = cost.length;
        int k = 50;
        
        System.out.println(maximumToys(cost,n,k));
    }
}