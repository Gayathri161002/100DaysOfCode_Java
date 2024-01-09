import java.util.*;
public class DP_RodCuttingProblem
{
    static int rodCutting(int[] pieces, int[] profit, int length)
    {
        if(pieces.length == 0 || profit.length == 0 || length == 0)
        {
            return 0;
        }
        
        int[][] A = new int[pieces.length][length+1];
        
        for(int i=0;i<pieces.length;i++)
        {
            A[i][0] = 0;
        }
        
        for(int i=0;i<pieces.length;i++)
        {
            for(int j=1;j<=length;j++)
            {
                int includingProfit = 0;
                int excludingProfit = 0;
                
                if(pieces[i] <= j)
                {
                    includingProfit = profit[i] + A[i][j-pieces[i]];
                }
                
                if(i > 0)
                {
                    excludingProfit = A[i-1][j];
                }
                
                A[i][j] = Math.max(includingProfit , excludingProfit);
            }
        }
        
        return A[pieces.length-1][length];
    }
    
    public static void main(String[] args) 
    {
        int[] pieces = {1, 2, 3, 4, 5};
        int[] profit = {3, 5, 10, 11, 15};
        int length = 6;
        System.out.println(rodCutting(pieces, profit, length));
    }
}