public class RecursionLLMergeList
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
    
    static LLnode mergeList(LLnode h1, LLnode h2)
    {
        if(h1 == null)
        {
            return h2;
        }
        if(h2 == null)
        {
            return h1;
        }
        
        LLnode result;
        if(h1.data < h2.data)
        {
            result = h1;
            result.next = mergeList(h1.next, h2);
        }
        else
        {
            result = h2;
            result.next = mergeList(h1, h2.next);
        }
        
        return result;
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
        head.next = new LLnode(3);
        head.next.next = new LLnode(5);
        head.next.next.next = new LLnode(7);
        
        LLnode head2 = new LLnode(2);
        head2.next = new LLnode(4);
        head2.next.next = new LLnode(6);
        head2.next.next.next = new LLnode(8);
        
        display(head);
        System.out.println();
        
        display(head2);
        System.out.println();
        
        display(mergeList(head,head2));
    }
}