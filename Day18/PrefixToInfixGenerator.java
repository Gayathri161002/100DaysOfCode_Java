import java.util.*;
public class PrefixToInfixGenerator
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
        char[] A=str.toCharArray();
        int len=A.length;
        
        for(int i=len-1;i>=0;i--)
        {
            if(isOperator(A[i]))
            {
                String op1=stk.pop();
                String op2=stk.pop();
                
                String t = op1 + A[i] + op2;
                
                stk.push(t);
            }
            
            else
            {
                stk.push(String.valueOf(A[i]));
            }
        }
        System.out.println("Infix Expression : " + stk);
    }
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Prefix expression : ");
		String str=s.nextLine();
		generateInfixExp(str);
	}
}

