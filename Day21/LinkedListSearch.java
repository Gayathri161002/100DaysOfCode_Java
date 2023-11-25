public class LinkedListSearch
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

    public static int search(int val)
    {
        int index=0;
        LLnode current = head;
        while(current != null)
        {
            if(current.data==val)
            {
                return index;
            }
            
            current = current.next;
            index++;
        }
        return -1;
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
        LinkedListSearch obj = new LinkedListSearch();
        obj.head = new LLnode(1);
        LLnode two = new LLnode(2);
        LLnode three = new LLnode(3);
        LLnode four = new LLnode(4);
        LLnode five = new LLnode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        int index=search(2);
        System.out.println("The index position : " + index);
        
    }
}

/*
Output :
The index position : 1
*/