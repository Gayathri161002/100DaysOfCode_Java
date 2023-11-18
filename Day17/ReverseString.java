import java.util.*;
public class ReverseString
{
    public static void main (String[] args) 
    {
        Stack<Character> stk = new Stack<>();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len = str.length();
        
        for(char c : str.toCharArray())
        {
            stk.push(c);
        }
        char[] rev_str=new char[len];
        int k=0;
        
        ListIterator<Character> li =stk.listIterator(stk.size());
        
        while(li.hasPrevious())
        {
            rev_str[k++]=li.previous();
        }
        
        System.out.println(rev_str);
    }        
}