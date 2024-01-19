public class DP_UncrossedLines
{
    static int uncrossedLines(int[] A,int[] B)
    {
        if(A.length == 0 || B.length == 0)
        {
            return 0;
        }
        
        int[][] dp = new int[A.length+1][B.length+1];
        
        for(int i=0;i<=A.length;i++)
        {
            for(int j=0;j<=B.length;j++)
            {
                if(i == 0 || j == 0)
                {
                    dp[i][j] = 0;
                }
                
                else if(A[i-1] == B[j-1])
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[A.length][B.length];
    }
    
    public static void main(String args[]) 
    {
        int[] A = {2, 3, 2, 4};
        int[] B = {2, 4, 3, 4};
        
        System.out.println(uncrossedLines(A,B));
    }
}