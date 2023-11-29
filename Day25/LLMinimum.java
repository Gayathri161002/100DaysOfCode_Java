public class LLMinimum
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
    
    public static int minimum()
    {
        int min = head.data;
        LLnode temp = head.next ;
        while(temp != null)
        {
            if(min > temp.data)
            {
                min = temp.data;
            }
            temp = temp.next;
        }
        
        return min;
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
        LLMinimum obj = new LLMinimum();
        obj.head = new LLnode(11);
        LLnode two = new LLnode(10);
        LLnode three = new LLnode(4);
        LLnode four = new LLnode(5);
        head.next = two;
        two.next = three;
        three.next = four; 
        
        display();
        int min = minimum();
        System.out.println("Minimum value In Linkedlist : " + min);
    }
}

/*
Output :
11->10->4->5->null
Minimum value In Linkedlist : 4
*/