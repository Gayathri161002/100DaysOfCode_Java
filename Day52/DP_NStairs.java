import java.util.*;
public class DP_NStairs
{
    static int nStairs(int[]stairs,int n)
    {
        if(n == 0)
            return 0;
        
        if(n == 1)
            return 1;
            
        if(n == 2)
            return 2;
        
        if(stairs[n] == 0)
        {
            stairs[n] = nStairs(stairs,n-1) + nStairs(stairs,n-2) + nStairs(stairs,n-3);
        }
        return stairs[n];
    }
    public static void main(String args[]) 
    {
        int n = 5;
        int[] stairs = new int[n+1];
         System.out.println(nStairs(stairs,n));
    }
}