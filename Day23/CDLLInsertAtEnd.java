public class CDLLInsertAtEnd
{
    private static LLnode head;
    private static LLnode tail;
    
    static class LLnode
    {
        LLnode prev;
        int data;
        LLnode next;
        
        public LLnode(int data)
        {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }
    
    public static void insertAtEnd(int val)
    {
        LLnode temp = new LLnode(val);
        if(head==null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            tail.next = temp;
            temp.prev = tail;
            temp.next = head;
            tail = temp;
        }
    }
    
    public static void display()
    {
        LLnode temp = head;
        do
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }while(temp != head);
        System.out.println();
    }
    
    public static void main(String args[])
    {
        CDLLInsertAtEnd dll = new CDLLInsertAtEnd();
        for(int i=1;i<6;i++)
        {
            insertAtEnd(i);
        }
        display();
        
    }
}

/*
Output :
1 2 3 4 5
*/