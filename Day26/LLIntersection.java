public class LLIntersection
{
    public static LLnode head1;
    public static LLnode head2;
    
    static class LLnode
    {
        int data;
        LLnode next;
        boolean visited;
        public LLnode(int data)
        {
            this.data = data;
            this.next = null;
            visited = false;
        }
    }
    
    public static boolean isIntersect()
    {
        LLnode temp1 = head1;
        while(temp1 != null)
        {
            temp1.visited = true;
            temp1 = temp1.next;
        }
        
        LLnode temp2 = head2;
        while(temp2 != null)
        {
            if(temp2.visited)
            {
                return true;
            }
            else
            {
                temp2.visited = true;
                temp2 = temp2.next;
            }
        }
        return false;
    }
    
    public static void main(String args[]) 
    {
        LLIntersection obj = new LLIntersection();
        obj.head1 = new LLnode(1);
        head1.next = new LLnode(2);
        head1.next.next = new LLnode(3);
        head1.next.next.next = new LLnode(4);
        obj.head2 = new LLnode(6);
        head2.next = new LLnode(5);
        head2.next.next = head1.next.next;
        head2.next.next.next = new LLnode(8);
        System.out.println(isIntersect());
    }
}

/*
Output :
true
*/