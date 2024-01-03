public class RecursionLLDisplay
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
    public static void main(String args[]) 
    {
        RecursionLLDisplay obj = new RecursionLLDisplay();
        obj.head = new LLnode(1);
        head.next = new LLnode(2);
        head.next.next = new LLnode(3);
        head.next.next.next = new LLnode(4);
        head.next.next.next.next = new LLnode(5);
        display(head);
    }
}