public class LinkedListInsertFirst
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

    public static void insertFirst(int val)
    {
        LLnode temp = new LLnode(val);
        temp.next=head;
        head=temp;
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
        LinkedListInsertFirst obj = new LinkedListInsertFirst();
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
        insertFirst(0);
        display();
    }
}

/*
Output :
1->2->3->4->5->null
0->1->2->3->4->5->null
*/