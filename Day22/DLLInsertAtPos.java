public class DLLInsertAtPos
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
    
    public static void insertSpecificPos(int val , int pos)
    {
        LLnode temp = new LLnode(val);
        LLnode current = head;
        if (pos == 1) 
        {
            temp.next = head;
            head.prev = temp;
            head = temp;
            return;
        }
        
        for(int i = 1; i < pos - 1 && current != null; i++)
        {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Invalid position : " + pos);
            return;
        }
        
        temp.next = current.next;
        if (current.next != null) {
            current.next.prev = temp;
        }
        current.next = temp;
        temp.prev = current;
        
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
        DLLInsertAtPos dll = new DLLInsertAtPos();
        dll.insertEnd(1);
        dll.insertEnd(2);
        dll.insertEnd(3);
        dll.insertEnd(5);
        display();
        dll.insertSpecificPos(4,4);
        display();
    }
}

/*
Output :
1->2->3->5->null
1->2->3->4->5->null
*/