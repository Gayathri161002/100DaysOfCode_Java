public class LLSwap
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
    
    public static void swap(int pos1,int pos2)
    {
        if(pos1 == pos2)
        {
            return; 
        }
        
        LLnode current1 = head;
        LLnode prev1 = null;
        for(int i=1;(i<pos1 && current1 != null); i++)
        {
            prev1 = current1;
            current1 = current1.next;
        }
        
        LLnode current2 = head;
        LLnode prev2 = null;
        for(int i=1;(i<pos2 && current2 != null); i++)
        {
            prev2 = current2;
            current2 = current2.next;
        }
        
        if(current1 == null || current2 == null)
        {
            return;
        }
        
        int k = current1.data;
        current1.data = current2.data;
        current2.data = k;
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
    
    public static void main(String args[]) 
    {
        LLSwap obj = new LLSwap();
        obj.head = new LLnode(11);
        head.next = new LLnode(22);
        head.next.next = new LLnode(44);
        head.next.next.next = new LLnode(55);
        System.out.println("Before swapping : ");
        display();
        swap(2,3);
        System.out.println("After swapping : ");
        display();
    }
}

/*
Output :
Before swapping : 
11 22 44 55 
After swapping : 
11 44 22 55 
*/