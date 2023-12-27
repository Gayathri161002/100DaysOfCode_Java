import java.util.*;
public class RecursionReverse
{
    static void reverse(String s)
    {
        if(s.length() == 0 || s.length() <= 1)
        {
            System.out.print(s);
        }    
        else
        {
            System.out.print(s.charAt(s.length()-1));
            reverse(s.substring(0,s.length()-1));
        }
    }
    public static void main(String args[]) 
    {
        String str = "java";
        reverse(str);
    }
}