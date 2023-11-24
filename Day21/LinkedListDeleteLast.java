public class LinkedListDeleteLast
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

    public static void deleteLast()
    {
        LLnode temp = head;
        while(temp.next.next != null)
        {
            temp=temp.next;
        }
        temp.next=null;
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
        LinkedListDeleteLast obj = new LinkedListDeleteLast();
        obj.head = new LLnode(1);
        LLnode two = new LLnode(2);
        LLnode three = new LLnode(3);
        LLnode four = new LLnode(4);
        LLnode five = new LLnode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        display();
        deleteLast();
        display();
    }
}

/*
Output :
1->2->3->4->5->null
1->2->3->4->null
*/