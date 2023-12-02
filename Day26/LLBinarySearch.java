public class LLBinarySearch
{
    public static LLnode head;
    public static int length=0;
    static class LLnode
    {
        int data;
        LLnode next;
        
        public LLnode(int data)
        {
            this.data = data;
            this.next = null;
            length++;
        }
    }
    
    public static void display()
    {
        LLnode current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static LLnode middle(LLnode start , LLnode last)
    {
        if(start==null)
        {
            return null;
        }
        
        LLnode slow = start;
        LLnode fast = start;
        
        while(fast.next != last && fast.next.next != last)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return slow;
    }
    
    public static boolean binarySearch(int data)
    {
        LLnode start = head;
        LLnode last = null;
        
        while(start != last)
        {
            LLnode mid = middle(start,last);
            
            if(mid.data==data)
            {
                return true;
            }
            else if(mid.data<data)
            {
                start = mid.next;
            }
            else if(mid.data>data)
            {
                last = mid;
            }
        }
        return false;
    }
    
    public static void main(String args[]) 
    {
        LLBinarySearch obj = new LLBinarySearch();
        obj.head = new LLnode(4);
        obj.head.next = new LLnode(5);
        obj.head.next.next = new LLnode(6);
        obj.head.next.next.next = new LLnode(10);
        display();
        if (binarySearch(5))
       {
           System.out.println("Found");
       }
       else
       {
           System.out.println("Not Found");
       }
    }

}

/*
Output :
4 5 6 10 
Found
*/