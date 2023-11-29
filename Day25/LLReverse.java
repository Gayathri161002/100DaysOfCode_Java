public class LLReverse
{
    private static LLnode head;
    
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
    
    public static void reverse()
    {
        LLnode prev = null;
        LLnode current = head;
        LLnode next = null;
        
        while(current != null)
        {
            next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
    }
   
    public static void display()
    {
        LLnode temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public static void main(String args[])
    {
        LLReverse obj = new LLReverse();
        obj.head = new LLnode(1);
        LLnode two = new LLnode(2);
        LLnode three = new LLnode(3);
        LLnode four = new LLnode(4);
        head.next = two;
        two.next = three;
        three.next = four; 
        
        display();
        reverse();
        display();
    }
}

/*
Output :
1->2->3->4->null
4->3->2->1->null
*/