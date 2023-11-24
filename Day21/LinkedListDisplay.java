public class LinkedListDisplay
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

    public static void display(LLnode head)
    {
        LLnode temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
    public static void main(String args[])
    {
        LinkedListDisplay obj = new LinkedListDisplay();
        obj.head = new LLnode(1);
        LLnode two = new LLnode(2);
        LLnode three = new LLnode(3);
        LLnode four = new LLnode(4);
        LLnode five = new LLnode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        
        display(head);
    }
}
