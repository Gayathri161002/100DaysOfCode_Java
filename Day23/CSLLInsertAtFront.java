public class CSLLInsertAtFront
{
    private static LLnode head;
    
    static class LLnode
    {
        int data;
        LLnode next;
        
        public LLnode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void insertAtFront(int val)
    {
        LLnode temp = new LLnode(val);
        LLnode current = head;
        while(current.next != head)
        {
            current = current.next;
        }
        current.next = temp;
        temp.next = head;
        head=temp;
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
        CSLLInsertAtFront sll = new CSLLInsertAtFront();
        sll.head = new LLnode(1);
        LLnode two = new LLnode(2);
        LLnode three = new LLnode(3);
        LLnode four = new LLnode(4);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = head;
        display();
        insertAtFront(0);
        display();
    }
}

/*
Output :
1 2 3 4 
0 1 2 3 4 
*/