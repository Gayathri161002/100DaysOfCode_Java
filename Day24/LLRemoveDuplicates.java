import java.util.HashSet;
public class LLRemoveDuplicates
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
    
    public static void removeDuplicates()
    {
        HashSet<Integer> uniqueValues = new HashSet<>();
        LLnode current = head;
        LLnode previous = null;
        
        while(current != null)
        {
            int currentData = current.data;
            
            if(uniqueValues.contains(currentData))
            {
                previous.next = current.next;
            }
            else
            {
                uniqueValues.add(currentData);
                previous = current;
            }
            
            current = current.next;
        }
    }
    
    public static void insert(int val)
    {
        LLnode temp = new LLnode(val);
        
        if(head == null)
        {
            head = temp;
        }
        else
        {
            LLnode current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = temp;
        }
    }
    
    public static void display()
    {
        LLnode temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("null\n");
    }
    public static void main(String args[])
    {
        LLRemoveDuplicates obj = new LLRemoveDuplicates();
        int[] A = {1,2,3,4,2,1,5,6};
        
        for(int i=0;i<A.length;i++)
        {
            obj.insert(A[i]);
        }
        System.out.println("Original Linked List:");
        display();
        
        removeDuplicates();
        
        System.out.println("Linked List after removing duplicates:");
        display();
    }
}

/*
Original Linked List:
1->2->3->4->2->1->5->6->null
Linked List after removing duplicates:
1->2->3->4->5->6->null
*/