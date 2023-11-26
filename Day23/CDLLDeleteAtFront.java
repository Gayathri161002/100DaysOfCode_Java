public class CDLLDeleteAtFront
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
    
    public static void deleteAtFront()
    {
        tail.next = head.next;
        head.next.prev = tail;
        head = head.next;
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
        CDLLDeleteAtFront dll = new CDLLDeleteAtFront();
        for(int i=0;i<6;i++)
        {
            insertAtEnd(i);
        }
        display();
        deleteAtFront();
        display();
    }
}

/*
Output :
0 1 2 3 4 5 
1 2 3 4 5 
*/