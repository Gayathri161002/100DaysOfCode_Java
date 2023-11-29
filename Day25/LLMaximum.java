public class LLMaximum
{
    private static LLnode head;
    static int length;
    
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
    
    public static int maximum()
    {
        int max = head.data;
        LLnode temp = head.next ;
        while(temp != null)
        {
            if(max < temp.data)
            {
                max = temp.data;
            }
            temp = temp.next;
        }
        
        return max;
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
        LLMaximum obj = new LLMaximum();
        obj.head = new LLnode(1);
        LLnode two = new LLnode(10);
        LLnode three = new LLnode(6);
        LLnode four = new LLnode(4);
        head.next = two;
        two.next = three;
        three.next = four; 
        
        display();
        int max = maximum();
        System.out.println("Maximum value In Linkedlist : " + max);
    }
}

/*
Output :
1->10->3->4->null
Maximum value In Linkedlist : 10
*/