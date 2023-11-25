public class DoubleLL
{
    private static LLnode head;
    private static LLnode tail;
    private static int length;
    
    static class LLnode
    {
        private LLnode prev;
        private int data;
        private LLnode next;
        
        public LLnode(int data)
        {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }
}