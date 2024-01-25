import java.util.*;
public class Greedy_FractionalKnapsack 
{
    static double maxValue(int[] weight, int[] profit, int capacity)
    {
        int n = weight.length;
        
        double[][] items = new double[n][3];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                items[i][0] = weight[i];
                items[i][1] = profit[i];
                items[i][2] = (double)(profit[i]/weight[i]);
            }
        }
        
        Arrays.sort(items, Comparator.comparingDouble((double[] item) -> item[2]).reversed());
        
        int maxVal = 0;
        int remainingCapacity = capacity;
        
        for(double[] item : items)
        {
            if(remainingCapacity <= 0)
            {
                break;
            }
            
            double fraction = Math.min(1.0 , remainingCapacity / item[0]);
            maxVal += fraction * item[1];
            remainingCapacity -= item[0];
        }
        
        return maxVal;
    }
    public static void main(String args[])
    {
        int[] weight = {10, 20, 30};
        int[] profit = {60, 100, 120};
        int capacity = 50;
        
        System.out.println(maxValue(weight, profit, capacity));
    }
}