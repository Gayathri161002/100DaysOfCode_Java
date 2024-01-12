import java.util.*;
public class CountOfPalindromicSubstrings
{
    static int countOfSubstrings(String s)
    {
        if(s.length() == 0)
        {
            return 0;
        }
        
        boolean dp[][] = new boolean[s.length()][s.length()];
        int count = s.length();
        
        for(int i=0;i<s.length();i++)
        {
            dp[i][i] = true;
        }
        
        for(int i=s.length()-2;i>=0;i--)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    if(dp[i+1][j-1] == true || j-i == 1)
                    {
                        dp[i][j] = true;
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
    
    public static void main(String args[]) 
    {
        String str = "bcacbef";
        
        System.out.println(countOfSubstrings(str));
    }
}