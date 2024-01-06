import java.util.*;
public class DP_LongestPalindromeSubsequence
{
    static int LPS(String str,int start,int end,int[][] A)
    {
        if(start > end)
        {
            return 0;
        }
        
        if(start == end)
        {
            return 1;
        }
        
        if(A[start][end] == 0)
        {
            if(str.charAt(start) == str.charAt(end))
            {
                A[start][end] = 2 + LPS(str,start+1,end-1,A);
            }
            
            else
            {
                A[start][end] = Math.max(LPS(str,start+1,end,A) , LPS(str,start,end-1,A));
            }
        }
        
        return A[start][end];
    }
    
    public static void main(String args[]) 
    {
        String str = "abefbac";
        int n = str.length()-1;
        int[][] A = new int[n+1][n+1];
        
        for(int i=0;i<n;i++)
        {
            Arrays.fill(A[i],0);
        }
        System.out.println(LPS(str,0,n,A));
    }
}