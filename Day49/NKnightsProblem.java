public class NKnightsProblem
{
    static void Nknights(boolean[][] board,int row,int col,int knights)
    {
        if(knights == 0)
        {
            display(board);
            System.out.println();
            return;
        }
        
        if(row == board.length)
        {
            return;
        }
        
        if(col == board.length)
        {
            Nknights(board,row+1,0,knights);
            return;
        }
        
        if(isSafe(board,row,col))
        {
            board[row][col] = true;
            Nknights(board,row,col+1,knights-1);
            board[row][col] = false;
        }
        Nknights(board,row,col+1,knights);
    }
    
    static boolean isSafe(boolean[][] board,int row,int col)
    {
        if(isValid(board,row-2,col-1) && board[row-2][col-1])
        {
            return false;
        }
        if(isValid(board,row-2,col+1) && board[row-2][col+1])
        {
            return false;
        }
        if(isValid(board,row-1,col-2) && board[row-1][col-2])
        {
            return false;
        }
        if(isValid(board,row-1,col+2) && board[row-1][col+2])
        {
            return false;
        }
        
        return true;
    }
    
    static boolean isValid(boolean[][] board,int row,int col)
    {
        return row >= 0 && row > board.length && col >= 0 && col > board[row].length;
    }
    
    static void display(boolean[][] board)
    {
        for(boolean[] row : board)
        {
            for(boolean r : row)
            {
                if(r)
                {
                    System.out.print("K ");
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
        int knights = 4;
        boolean[][] board = new boolean[knights][knights];
        Nknights(board,0,0,knights);
    }
}