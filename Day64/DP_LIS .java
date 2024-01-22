import java.util.*;
public class DP_LIS 
{
    static int LIS(int[] A)
    {
        int[] dp = new int[A.length];
        Arrays.fill(dp,1);
        int maxLen = 1;
        
        for(int i=1;i<A.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(A[i] > A[j] && dp[i] <= dp[j])
                {
                    dp[i] = dp[j] + 1;
                    maxLen = Math.max(maxLen , dp[i]);
                }
            }
        }
        
        return maxLen;
    }
    
    public static void main(String args[])
    {
        int[] A = {5, 4, 7, 8, 2, 9};
        System.out.println(LIS(A));
    }
}