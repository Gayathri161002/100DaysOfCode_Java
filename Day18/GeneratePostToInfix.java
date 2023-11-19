import java.util.*;
public class GeneratePostToInfix
{
    public static boolean isOperator(char c)
    {
        if(c!='+' && c!='*' && c!='/' && c!='-' && c!='%')
        {
            return false;
        }
        
        return true;
    }
    public static void generateInfixExp(String str)
    {
        Stack<String> stk = new Stack<>();
        
        for(char c : str.toCharArray())
        {
            if(isOperator(c))
            {
                String op1=stk.pop();
                String op2=stk.pop();
                
                String t = op2 + c + op1;
                
                stk.push(t);
            }
            
            else
            {
                stk.push(String.valueOf(c));
            }
        }
        System.out.println("Infix Expression : " + stk);
    }
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter postfix expression : ");
		String str=s.nextLine();
		generateInfixExp(str);
	}
}

