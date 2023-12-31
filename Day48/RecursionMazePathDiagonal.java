import java.util.ArrayList;
public class RecursionMazePathDiagonal
{
    static ArrayList<String> mazePath(String p,int r,int c)
    {
        if(r == 1 && c == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        if(r > 1 && c > 1)
        {
            ans.addAll(mazePath(p + 'D' , r-1 , c-1));
        }
        if(r > 1)
        {
            ans.addAll(mazePath(p + 'V' , r-1 , c));
        }
        if(c > 1)
        {
            ans.addAll(mazePath(p + 'H' , r , c-1));
        }
        
        return ans;
    }
    public static void main(String args[]) 
    {
      System.out.println(mazePath("",3,3));
    }
}