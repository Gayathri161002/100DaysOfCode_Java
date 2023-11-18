import java.util.*;
public class StackPush
{
    public static void main (String[] args) 
    {
        Stack<Integer> stk = new Stack<>();
        
        boolean result=stk.empty();
        System.out.println("Is stack empty or not ? : " + result);
        
        stk.push(100);
        stk.push(200);
        stk.push(300);
        stk.push(400);
        stk.push(500);
        
        System.out.println("stack elements are...");
        System.out.println(stk);
        
        result=stk.empty();
        System.out.println("Is stack empty or not ? : " + result); 
    }
}