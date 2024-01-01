public class NQueensProblem
{
    static int queen(boolean[][] board , int row)
    {
        if(row == board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        
        int count = 0;
        
        for(int col = 0;col < board.length ; col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = true;
                count += queen(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    
    static boolean isSafe(boolean[][] board,int r,int c)
    {   
        //vertical check
        for(int i=0;i<r;i++)
        {
            if(board[i][c])
            {
                return false;
            }
        }
        
        //diagonal left
        int maxLeft = Math.min(r,c);
        for(int i=1;i<=maxLeft;i++)
        {
            if(board[r-i][c-i])
            {
                return false;
            }
        }
        
        //diagonal Right
        int maxRight = Math.min(r,board.length-c-1);
        for(int i=1;i<=maxRight;i++)
        {
            if(board[r-i][c+i])
            {
                return false;
            }
        }
        
        return true;
    }
    
    static void display(boolean[][] board)
    {
        for(boolean[] row : board)
        {
            for(boolean r : row)
            {
                if(r)
                {
                    System.out.print("Q ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) 
    {
        int n = 4;
        boolean[][] board = new boolean[n][n]; 
        System.out.println("No Of ways : " + queen(board,0));
    }
}