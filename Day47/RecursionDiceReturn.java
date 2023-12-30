import java.util.*;
public class RecursionDiceReturn
{
    static ArrayList<String> dice(String p,int target)
    {
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i = 1 ;i <= 6 && i <= target ;i++)
        {
            ans.addAll(dice(p + i,target - i));
        }
        return ans;
    }
    public static void main(String args[])
    {
       System.out.println(dice("",5));
    }
}