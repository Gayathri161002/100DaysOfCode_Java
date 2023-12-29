// it returns the ASCII value of substring. For ex a-97 b-98 c-99 ab-9798

import java.util.*;
public class RecursionSubSeqAscii
{
    static void subseqAscii(String p ,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }    
        
        char ch = up.charAt(0);
    
        subseqAscii(p ,up.substring(1));
        subseqAscii(p + (ch + 0),up.substring(1));
    }
    public static void main(String args[]) 
    {
       String str = "abc";
       subseqAscii("",str);
    }
}