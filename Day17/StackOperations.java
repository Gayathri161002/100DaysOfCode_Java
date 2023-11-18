import java.util.*;
public class StackOperations
{
    public static void main (String[] args) 
    {
        Stack<Integer> stk = new Stack<>();
        
        stk.push(100);
        stk.push(200);
        stk.push(300);
        stk.push(400);
        stk.push(500);
        
        System.out.println("stack elements are...");
        System.out.println(stk);
        
        int s=stk.size();
        System.out.println("size of the stack : " + s); 
        
        int x=stk.peek();
        System.out.println("Peek element after pop operation : " + x);
        
        while(s!=0)
        {
            stk.pop();
            s--;
        }
        
        s=stk.size();
        System.out.println("size of the stack : " + s); 
    }
}