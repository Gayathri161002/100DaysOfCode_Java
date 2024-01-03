public class RecursionLLFloyd
{
    public static LLnode head;
    static class LLnode
    {
        private int data;
        private LLnode next;
        
        public LLnode(int data)
        {
            this.data = data;
            this.next = next;
        }
    }

    static void display(LLnode node)
    {
        if(node == null)
        {
            return;
        }
        System.out.print(node.data + " ");
        node = node.next;
        display(node);
    }
    
    static boolean floyd(LLnode slowptr , LLnode fastptr)
    {
        if(slowptr == null || fastptr == null || fastptr.next == null)
        {
            return false;
        }
        
        if(slowptr.data == fastptr.data)
        {
            return true;
        }
        
        return floyd(slowptr.next,fastptr.next.next);
    }
    
    public static void main(String args[]) 
    {
        head = new LLnode(1);
        head.next = new LLnode(3);
        head.next.next = new LLnode(5);
        head.next.next.next = new LLnode(3);
        head.next.next.next.next = new LLnode(7);
        
        display(head);
        
        System.out.println(floyd(head,head.next));
        
    }
}