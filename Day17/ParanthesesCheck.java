import java.util.*;
public class ParanthesesCheck
{
    public static void main (String[] args) 
    {
        Stack<Character> stk = new Stack<>();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len = str.length();
        
        for(char c : str.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{')
            {
                stk.push(c);
            }
            
            else if((c==')' && !stk.isEmpty() && stk.peek()=='(') || (c==']' && !stk.isEmpty() && stk.peek()=='[') || (c=='}' && !stk.isEmpty() && stk.peek()=='{'))
            {
                stk.pop();
            }
        }
        
        boolean result = stk.empty();
        
        if(result)
        {
            System.out.println("parantheses are balanced");
        }
        else
        {
            System.out.println("parantheses are not balanced");
        }
    }        
}