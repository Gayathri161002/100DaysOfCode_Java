import java.util.*;
public class RecursionSkipCharacter
{
    static String skip(String str)
    {
        if(str.isEmpty())
        {
            return " ";
        }    
        
        char ch = str.charAt(0);
        
        if(ch == 'a')
        {
            return skip(str.substring(1));
        }
        else
        {
            return ch + skip(str.substring(1));
        }
    }
    public static void main(String args[]) 
    {
       String str = "baccad";
       System.out.print(skip(str));
    }
}