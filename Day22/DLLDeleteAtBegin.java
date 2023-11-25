public class DLLDeleteAtBegin
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
    
    public static void deleteFirst()
    {
        head=head.next;
        head.prev=null;
    }
    
    public static void insertEnd(int val)
    {
        LLnode temp = new LLnode(val);
        
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else
        {
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
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
        DLLDeleteAtBegin dll = new DLLDeleteAtBegin();
        for(int i=1;i<6;i++)
        {
            dll.insertEnd(i);
        }
        display();
        dll.deleteFirst();
        display();
    }
}

/*
Output :
1->2->3->4->5->null
2->3->4->5->null
*/