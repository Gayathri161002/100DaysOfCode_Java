import java.util.*;
public class RecursionPalindromeString
{
    static boolean palindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true;
            
        if(s.charAt(0) == s.charAt(s.length() - 1))
        {
            return palindrome(s.substring(1,s.length()-1));
        }
        return false;
    }
    public static void main(String args[]) 
    {
        String str = "mom";
        if(palindrome(str))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
    }
}