import java.util.*;
public class DP_NStairsMinimumSteps
{
    static int nStairs(int[]stairs,int n)
    {
        if(n == 0)
            return 0;
        
        if(n == 1 || n == 2 || n == 3)
            return 1;
        
        if(stairs[n] == 0)
        {
            stairs[n] = 1 + Math.min(Math.min(nStairs(stairs,n-1) , nStairs(stairs,n-2)) , nStairs(stairs,n-3));
        }
        return stairs[n];
    }
    public static void main(String args[]) 
    {
        int n = 7;
        int[] stairs = new int[n+1];
         System.out.println(nStairs(stairs,n));
    }
}