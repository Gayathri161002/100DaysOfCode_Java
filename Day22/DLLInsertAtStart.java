public class DLLInsertAtStart
{
    private static LLnode head;
    private static LLnode tail;
    private static int length;
    
    static class LLnode
    {
        private LLnode prev;
        private int data;
        private LLnode next;
        
        public LLnode(int data)
        {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }
    
    public static void insertStart(int val)
    {
        LLnode temp = new LLnode(val);
        
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else
        {
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }
    
    public static void display()
    {
        LLnode current = head;
        while(current != null)
        {
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public static void main(String args[])
    {
        DLLInsertAtStart dll = new DLLInsertAtStart();
        dll.insertStart(1);
        dll.insertStart(2);
        dll.insertStart(3);
        dll.insertStart(4);
        display();
    }
}

/*
Output :
4->3->2->1->null
*/