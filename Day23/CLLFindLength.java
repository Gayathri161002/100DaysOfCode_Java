public class CLLFindLength
{
    private static LLnode head;
    static int length = 0;
    
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
    
    public static int findLength()
    {
        LLnode temp = head;
        do
        {
            temp=temp.next;
            length++;
        }while(temp != head);
        
        return length;
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
        CLLFindLength sll = new CLLFindLength();
        sll.head = new LLnode(1);
        LLnode two = new LLnode(2);
        LLnode three = new LLnode(3);
        LLnode four = new LLnode(4);
        LLnode five = new LLnode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = head;
        display();
        int len = findLength();
        System.out.println("Length : " + len);
    }
}

/*
Output :
1 2 3 4 5 
Length : 5
*/