import java.util.ArrayList;
public class RecursionMazeObstacle
{
    static ArrayList<String> mazePath(String p,boolean[][] maze,int r,int c)
    {
        if(r == maze.length - 1 && c == maze[0].length - 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        if(!maze[r][c])
        {
            return ans;
        }
        
        if(r < maze.length - 1)
        {
            ans.addAll(mazePath(p + 'D' , maze , r+1 , c));
        }
        if(c < maze[0].length - 1)
        {
            ans.addAll(mazePath(p + 'R' , maze , r , c+1));
        }
        
        return ans;
    }
    public static void main(String args[]) 
    {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
      System.out.println(mazePath("",maze,0,0));
    }
}