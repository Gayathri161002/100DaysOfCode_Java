import java.util.*;
public class RecursionSubSequences
{
    static void subsequence(String p ,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }    
        
        char ch = up.charAt(0);
        
        subsequence(p + ch,up.substring(1));
        subsequence(p ,up.substring(1));
    }
    public static void main(String args[]) 
    {
       String str = "abc";
       subsequence("",str);
    }
}