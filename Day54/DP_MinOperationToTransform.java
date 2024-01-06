import java.util.*;
public class DP_MinOperationToTransform 
{
    static int minOperationToTransform(String s1, String s2, int len1, int len2)
    {
        if(s1 == s2)
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
        
        int[][] A = new int[len1+1][len2+1];
        
        for(int i=0;i<=len1;i++)
        {
            A[i][0] = i;
        }
        
        for(int i=0;i<=len2;i++)
        {
            A[0][i] = i;
        }
        
        for(int i=1;i<=len1;i++)
        {
            for(int j=1;j<=len2;j++)
            {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    A[i][j] = A[i-1][j-1];
                }
                
                else
                {
                    A[i][j] = 1 + Math.min((Math.min(A[i-1][j-1] , A[i-1][j])) , A[i][j-1]);
                }
            }
        }
        
        return A[len1][len2];
    }
    
    public static void main(String args[]) 
    {
        String s1 = "bat";
        String s2 = "ball";
        
        System.out.println(minOperationToTransform(s1, s2, s1.length(), s2.length()));
    }
}