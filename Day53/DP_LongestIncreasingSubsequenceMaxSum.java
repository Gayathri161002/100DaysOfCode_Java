import java.util.*;
public class DP_LongestIncreasingSubsequenceMaxSum
{
    static int longestIncreasingSubsequenceMaxSum(int[] arr)
    {
        int[] list = new int[arr.length];
        list = arr.clone();  
        int maxSum = 1;
        
        for(int i = 1; i < list.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(arr[i] > arr[j] && arr[i] + list[j] > list[i])
                {
                    list[i] = arr[i] + list[j];
                    maxSum = Math.max(maxSum , list[i]);
                }
            }
        }
        
        return maxSum;
    }
    
    public static void main(String args[]) 
    {
      int[] arr = {7,1,4,8,11,2,15,3}; 
      System.out.println(longestIncreasingSubsequenceMaxSum(arr));
    }
}