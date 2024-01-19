public class DP_LongestRepeatingSubsequence
{
    static int LRS(char[] A)
    {
        if(A.length == 0)
        {
            return 0;
        }
        
        int[][] dp = new int[A.length+1][A.length+1];
        
        for(int i=0;i<=A.length;i++)
        {
            for(int j=0;j<=A.length;j++)
            {
                if(i == 0 || j == 0)
                {
                    dp[i][j] = 0;
                }
                
                else if(A[i-1] == A[j-1] && i != j)
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[A.length][A.length];
    }
    
    public static void main(String args[]) 
    {
        char[] A = {'A', 'A', 'B', 'B'};
        
        System.out.println(LRS(A));
    }
}