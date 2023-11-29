public class LLRotate
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
    
    public static void rotate(int k)
    {
        if(k<=0 || head == null)
        {
            return;
        }
        int count = 0;
        LLnode temp = head;
        while(temp != null)
        {
            count++;
            temp=temp.next;
        }
        
        k = k % count;
        if(k==0)
        {
            return;
        }
        
        temp = head;
        
        for(int i= 1 ; i < count - k ; i++)
        {
            temp = temp.next;
        }
        LLnode new_head = temp.next; 
        temp.next = null;
        temp = new_head ;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head;
        head = new_head;
        
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
        LLRotate obj = new LLRotate();
        obj.head = new LLnode(1);
        LLnode two = new LLnode(2);
        LLnode three = new LLnode(3);
        LLnode four = new LLnode(4);
        LLnode five = new LLnode(5);
        LLnode six = new LLnode(6);
        head.next = two;
        two.next = three;
        three.next = four; 
        four.next = five;
        five.next = six;
        
        display();
        rotate(4);
        display();
    }
}

/*
Output :
1->2->3->4->5->6->null
3->4->5->6->1->2->null
*/