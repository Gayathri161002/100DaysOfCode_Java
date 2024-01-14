import java.util.*;
public class DPFibonacci
{
    static int fibo(int n)
    {
        int[] dp = new int[n+1];
        Arrays.fill(dp,0);
        
        dp[1] = 1;
        
        for(int i=0;i<n;i++)
        {
            dp[i+1] += dp[i];
            if(i+2 <= n)
            {
                dp[i+2] += dp[i];
            }
        }
        
        return dp[n];
        
    }
    public static void main(String args[]) 
    {
        int n = 8;
        System.out.println(fibo(n));
    }
}