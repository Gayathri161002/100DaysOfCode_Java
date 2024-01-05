import java.util.*;
public class DP_LCSubString
{
    static int LCS(String s1,String s2,int len1,int len2)
    {
        if(len1 == 0 || len2 == 0)
        {
            return 0;
        }
        
        int[][] A = new int[len1+1][len2+1];
        int countLCS = 0; 
         
        for(int i=1;i<=len1;i++)
        {
            for(int j=1;j<=len2;j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    A[i][j] = 1 + A[i-1][j-1];
                    countLCS = Math.max(countLCS,A[i][j]);
                }
                else
                {
                    A[i][j] = 0;
                }
            }
        }
        
        return countLCS;
    }
    
    public static void main(String args[]) 
    {
        String s1 = "abed";
        String s2 = "abesd";
        System.out.println(LCS(s1, s2, s1.length(), s2.length()));
    }
}