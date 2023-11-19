import java.util.*;
public class GeneratePostToPrefix
{
    public static boolean isOperator(char c)
    {
        if(c!='+' && c!='*' && c!='/' && c!='-' && c!='%')
        {
            return false;
        }
        
        return true;
    }
    public static void generatePreExp(String str)
    {
        Stack<String> stk = new Stack<>();
        
        for(char c : str.toCharArray())
        {
            if(isOperator(c))
            {
                String op1=stk.pop();
                String op2=stk.pop();
                
                String t = c + op2 + op1;
                
                stk.push(t);
            }
            
            else
            {
                stk.push(String.valueOf(c));
            }
        }
        System.out.println("Prefix Expression : " + stk);
    }
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter postfix expression : ");
		String str=s.nextLine();
		generatePreExp(str);
	}
}

