import java.util.*;
public class MaxSumArrayNonConsecutiveElements
{
    static int maxSum(int[] A)
    {
        if(A.length == 0)
        {
            return 0;
        }
        
        if(A.length == 1)
        {
            return A[0];
        }
        
        int dp[] = new int[A.length];
        
        dp[0] = A[0];
        dp[1] = A[0] > A[1] ? A[0] : A[1];
        
        for(int i=2;i<A.length;i++)
        {
            dp[i] = Math.max(dp[i-1] , A[i]+dp[i-2]);
        }
        
        return dp[A.length-1];
    }
    
    public static void main(String args[]) 
    {
        int[] A = {4, 2, 3, 5, 1, 6, 7};
        
        System.out.println(maxSum(A));
    }
}