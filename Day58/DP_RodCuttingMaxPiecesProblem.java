import java.util.*;
public class DP_RodCuttingMaxPiecesProblem
{
    static int rodCuttingMaxPieces(int[] pieces, int length)
    {
        if(pieces.length == 0 || length == 0)
        {
            return 0;
        }
        
        int[][] A = new int[pieces.length][length+1];
        
        for(int i=0;i<pieces.length;i++)
        {
            for(int j=0;j<=length;j++)
            {
                A[i][j] = -1;
            }
        }    
        
        for(int i=0;i<pieces.length;i++)
        {
            A[i][0] = 0;
        }
        
        for(int i=0;i<pieces.length;i++)
        {
            for(int j=1;j<=length;j++)
            {
                int includingPiece = -1;
                int excludingPiece = -1;
                
                if(pieces[i] <= j && A[i][j-pieces[i]] != -1)
                {
                    includingPiece = 1 + A[i][j-pieces[i]];
                }
                
                if(i > 0)
                {
                    excludingPiece = A[i-1][j];
                }
                
                A[i][j] = Math.max(includingPiece , excludingPiece);
            }
        }
        
        return A[pieces.length-1][length];
    }
    
    public static void main(String[] args) 
    {
        int[] pieces = {2, 3, 4, 5};
        int length = 7;
        System.out.println(rodCuttingMaxPieces(pieces, length));
    }
}