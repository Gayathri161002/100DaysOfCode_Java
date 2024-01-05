import java.util.*;
public class DP_LCS
{
    static int LCS(String s1,String s2,int len1,int len2,int[][] A)
    {
        if(len1 == 0 || len2 == 0)
        {
            return 0;
        }
        
        if(A[len1][len2] == 0)
        {
            if(s1.charAt(len1-1) == s2.charAt(len2-1))
            {
               A[len1][len2] = 1 + LCS(s1, s2, len1-1, len2-1, A);
            }
            else
            {
                A[len1][len2] = Math.max(LCS(s1, s2, len1-1, len2, A) , LCS(s1, s2, len1, len2-1, A));
            }
        }
        
        return A[len1][len2];
    }
    
    public static void main(String args[]) 
    {
        String s1 = "abed";
        String s2 = "absfegh";
        
        int[][] arr = new int[s1.length()+1][s2.length()+1];
        
        for (int i = 0; i <= s1.length(); i++)
        {
            Arrays.fill(arr[i], 0);
        }
      System.out.println(LCS(s1, s2, s1.length(), s2.length(), arr));
    }
}