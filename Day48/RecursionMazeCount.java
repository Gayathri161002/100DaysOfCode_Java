public class RecursionMazeCount 
{
    static int mazeCount(int r,int c)
    {
        if(r == 1 || c == 1)
        {
            return 1;
        }
        
        int left = mazeCount(r-1,c);
        int right = mazeCount(r,c-1);
        return left + right;
    }
    public static void main(String args[]) 
    {
      System.out.println(mazeCount(3,3));
    }
}