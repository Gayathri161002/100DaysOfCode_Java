import java.util.*;
public class RecursionPermutationCount
{
    static int permutations(String p,String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
 
        int count = 0;
        char ch = up.charAt(0);
        
        for(int i=0;i<=p.length();i++)
        {
            String first = p.substring(0,i);
            String sec = p.substring(i,p.length());
            count = count + permutations(first + ch + sec , up.substring(1));
        }
        
        return count;
    }
    public static void main(String args[])
    {
       String str = "abc";
       System.out.println(permutations("",str));
    }
}