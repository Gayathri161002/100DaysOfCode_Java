import java.util.*;
public class DP_MinimumEditDistance
{
    static int minimumEditDistance(String s1, String s2, int len1, int len2)
    {
        if(s1.equals(s2))
        {
            return 0;
        }
        
        if(len1 == 0)
        {
            return len2;
        }
        
        if(len2 == 0)
        {
            return len1;
        }
        int[][] result = new int[len1 + 1][len2 + 1];
        
        for(int i=0;i<=len1;i++)
        {
            result[i][0] = i;
        }
        
        for(int i=0;i<=len2;i++)
        {
            result[0][i] = i;
        }
        
        for(int i=1;i<=len1;i++)
        {
            for(int j=1;j<=len2;j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    result[i][j] = result[i-1][j-1];
                }
                
                else
                {
                    result[i][j] = 1 + Math.min(Math.min(result[i-1][j], result[i][j-1]), result[i-1][j-1]);
                }
            }
        }
        
        return result[len1][len2];
    }
    
    public static void main(String args[]) 
    {
        String str1 = "abc";
        String str2 = "abed";
        
        System.out.println(minimumEditDistance(str1,str2,str1.length(),str2.length()));
    }
}