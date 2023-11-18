import java.util.*;
public class StackLoops
{
    public static void main (String[] args) 
    {
        Stack<Integer> stk = new Stack<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            stk.push(i);
        }
        
        System.out.println("stack elements are [ASC]...");
        
        Iterator i = stk.iterator();
        
        while(i.hasNext())
        {
            System.out.print(i.next() + " ");
        }
        
        System.out.println("\nstack elements are [DESC]...");
        
        ListIterator<Integer> li =stk.listIterator(stk.size());
        
        while(li.hasPrevious())
        {
            System.out.print(li.previous() + " ");
        }
    }        
}