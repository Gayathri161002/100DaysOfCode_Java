import java.util.*;
public class ReverseIndividualWords
{
    public static void reverseIndividual(String str)
    {
         Stack<Character> stk = new Stack<>();
         char[] rev_str=new char[str.length()];
         int k=0;
         for(char c : str.toCharArray())
         {
             if(c!=' ')
             {
                 stk.push(c);
             }
             
             else
             {
                 while(!(stk.empty()))
                 {
                    rev_str[k++]=stk.pop();
                 }
                 rev_str[k++]=' ';
             }
         }
         
         while(!(stk.empty()))
         {
                rev_str[k++]=stk.pop();
         }
         
         System.out.println(rev_str);
    }
    public static void main (String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        reverseIndividual(str);
    }        
}