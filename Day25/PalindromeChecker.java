import java.util.*;
public class PalindromeChecker
{
    private static LLnode head;
    static int length;
    
    static class LLnode
    {
        private int data;
        private LLnode next;
        
        public LLnode(int data)
        {
             this.data = data;
             this.next = null;
        }
    }

    public static boolean isPalindrome()
    {
        if(length <= 1)
        {
            return true;
        }
        Stack<Integer> stk = new Stack<>();
        
        LLnode current = head;
        for(int i=0;i<length/2;i++)
        {
            stk.push(current.data);
            current = current.next;
        }
        
        if(length % 2 == 1)
        {
            current = current.next;
        }
       
        while (current != null) 
        {
            int i = stk.pop();
            if (i == current.data) 
            {
                current = current.next;
            } else 
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String args[])
    {
        PalindromeChecker obj = new PalindromeChecker();
        obj.head = new LLnode(4);
        LLnode two = new LLnode(5);
        LLnode three = new LLnode(5);
        LLnode four = new LLnode(4);
        head.next = two;
        two.next = three;
        three.next = four; 
        length = 4;
        boolean result = isPalindrome();
        if(result)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}