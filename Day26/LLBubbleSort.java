public class LLBubbleSort
{
    public static LLnode head;
    public static int length=0;
    static class LLnode
    {
        int data;
        LLnode next;
        
        public LLnode(int data)
        {
            this.data = data;
            this.next = null;
            length++;
        }
    }
    
    public static void display()
    {
        LLnode current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void bubbleSort()
    {
        if(head == null || length == 1)
        {
            return;
        }
        
        for(int i=0; i<length; i++)
        {
            LLnode current = head;
            LLnode currentNext = head.next;
            for(int j=0; j<length-1-i; j++)
            {
                if(current.data > currentNext.data)
                {
                    int temp = current.data;
                    current.data = currentNext.data;
                    currentNext.data = temp;
                }
                current = currentNext;
                currentNext = currentNext.next;
            }
        }
    }
    
    public static void main(String args[]) 
    {
        LLBubbleSort obj = new LLBubbleSort();
        obj.head = new LLnode(5);
        LLnode two = new LLnode(4);
        LLnode three = new LLnode(3);
        LLnode four = new LLnode(2);
        LLnode five = new LLnode(1);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        
        System.out.println("Original List : ");
        display();
        bubbleSort();
        System.out.println("Sorted List : ");
        display();
    }
}

/*
Output :
Original List : 
5 4 3 2 1 
Sorted List : 
1 2 3 4 5 
*/