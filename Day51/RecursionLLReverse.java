public class RecursionLLReverse
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
    static LLnode reverse(LLnode node)
    {
        if(node == null || node.next == null)
        {
            return node;
        }
        
        LLnode newNode = reverse(node.next);
        node.next.next = node;
        node.next = null;
        
        return newNode;
       
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
        head = new LLnode(1);
        head.next = new LLnode(2);
        head.next.next = new LLnode(3);
        head.next.next.next = new LLnode(4);
        head.next.next.next.next = new LLnode(5);
        
        display(head);
        head = reverse(head);
        System.out.println();
        display(head);
    }
}