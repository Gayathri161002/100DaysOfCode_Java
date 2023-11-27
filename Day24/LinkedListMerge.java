public class LinkedListMerge
{
    private static LLnode head1;
    private static LLnode head2;
    
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

    public static void merge(LLnode head1 ,LLnode head2)
    {
        LLnode temp = head1;
        
        while(temp.next != null)
        {
            temp=temp.next;
        }
        temp.next = head2;
    }
    
    public static void display(LLnode head)
    {
        LLnode temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("null\n");
    }
    public static void main(String args[])
    {
        LinkedListMerge obj = new LinkedListMerge();
        obj.head1 = new LLnode(1);
        LLnode two = new LLnode(2);
        LLnode three = new LLnode(3);
        head1.next = two;
        two.next = three;
        System.out.println("Linked list 1 : ");
        display(head1);
        
        obj.head2 = new LLnode(4);
        LLnode five = new LLnode(5);
        LLnode six = new LLnode(6);
        head2.next = five;
        five.next = six;
        System.out.println("Linked list 2 : ");
        display(head2);
        
        merge(head1 , head2);
        System.out.println("Linked list after merge operation : ");
        display(head1);
    }
}

/*
Linked list 1 : 
1->2->3->null
Linked list 2 : 
4->5->6->null
Linked list after merge operation : 
1->2->3->4->5->6->null
*/