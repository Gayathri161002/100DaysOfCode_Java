import java.util.*;
public class RecursionPermutationReturn
{
    static ArrayList<String> permutations(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        char ch = up.charAt(0);
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i=0;i<=p.length();i++)
        {
            String first = p.substring(0,i);
            String sec = p.substring(i,p.length());
            ans.addAll(permutations(first + ch + sec , up.substring(1)));
        }
        return ans;
    }
    public static void main(String args[])
    {
       String str = "abc";
       System.out.println(permutations("",str));
    }
}