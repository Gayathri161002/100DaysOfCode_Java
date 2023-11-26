public class CSLLDeleteAtFront
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
    
    public static void deleteAtFront()
    {
        LLnode current = head;
        while(current.next != head)
        {
            current = current.next;
        }
        current.next = head.next;
        head = head.next;
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
        CSLLDeleteAtFront sll = new CSLLDeleteAtFront();
        sll.head = new LLnode(1);
        LLnode two = new LLnode(2);
        LLnode three = new LLnode(3);
        LLnode four = new LLnode(4);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = head;
        display();
        deleteAtFront();
        display();
    }
}

/*
Output :
1 2 3 4 
2 3 4 
*/