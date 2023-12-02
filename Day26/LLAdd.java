public class LLAdd
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
    
    public static int add()
    {
        if(head == null)
        {
            return 0;
        }
        else
        {
            int sum = 0;
            LLnode current = head;
            while(current != null)
            {
                sum = sum*10 + current.data; 
                current = current.next;
            }
            return sum;
        }
    }
    
    public static void main(String args[]) 
    {
        LLAdd obj = new LLAdd();
        obj.head = new LLnode(4);
        head.next = new LLnode(5);
        head.next.next = new LLnode(6);
        System.out.println(add());
    }
}

/*
Output :
456
*/