public class DP_PatternMatchingLCS 
{
    
    static String findLCS(String text, String pattern)
    {
        int m = text.length();
        int n = pattern.length();
        
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                if (text.charAt(i - 1) == pattern.charAt(j - 1)) 
                {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } 
                else
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) 
        {
            if (text.charAt(i - 1) == pattern.charAt(j - 1)) 
            {
                result.insert(0, text.charAt(i - 1));
                i--;
                j--;
            }
            else if (dp[i - 1][j] > dp[i][j - 1])
            {
                i--;
            } 
            else 
            {
                j--;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) 
    {
        String text = "ABABCABAB";
        String pattern = "BAC";

        String lcs = findLCS(text, pattern);

        if (lcs.equals(pattern)) 
        {
            System.out.println("Pattern found in the text.");
        } 
        else
        {
            System.out.println("Pattern not found in the text.");
        }
    }
}
