import java.util.*;
public class DP_LongestIncreasingSubsequence
{
    static int longestIncreasingSubsequence(int[] arr)
    {
        int[] list = new int[arr.length];
        Arrays.fill(list,1);
        int maxLen = 1;
        
        for(int i = 1; i < list.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(arr[i] > arr[j] && list[j] + 1 > list[i])
                {
                    list[i] = list[j] + 1;
                    maxLen = Math.max(maxLen , list[i]);
                }
            }
        }
        
        return maxLen;
    }
    
    public static void main(String args[]) 
    {
      int[] arr = {7,1,4,8,11,2,14,3}; 
      System.out.println(longestIncreasingSubsequence(arr));
    }
}