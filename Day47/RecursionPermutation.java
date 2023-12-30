import java.util.*;
public class RecursionPermutation 
{
    static void permutations(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);
        
        for(int i=0;i<=p.length();i++)
        {
            String first = p.substring(0,i);
            String sec = p.substring(i,p.length());
            permutations(first + ch + sec , up.substring(1));
        }
    }
    public static void main(String args[])
    {
       String str = "abc";
       permutations("",str);
    }
}