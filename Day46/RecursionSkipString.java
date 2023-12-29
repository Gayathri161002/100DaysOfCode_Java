import java.util.*;
public class RecursionSkipString
{
    static String skip(String str)
    {
        if(str.isEmpty())
        {
            return " ";
        }    
        
        if(str.startsWith("hlo"))
        {
            return skip(str.substring(3));
        }
        else
        {
            return str.charAt(0) + skip(str.substring(1));
        }
    }
    public static void main(String args[]) 
    {
       String str = "hii hlo hii hlo hlo hiii";
       System.out.print(skip(str));
    }
}