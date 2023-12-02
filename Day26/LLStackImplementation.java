public class LLStackImplementation
{
    public static LLnode head;
    public static LLnode tail;
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
    
    public static boolean isEmpty()
    {
        return length==0;
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
    
    public static void push(int data)
    {
        LLnode temp = new LLnode(data);
        if(head==null)
        {
            head = temp;
            tail = head;
        }
        else
        {
            tail.next = temp;
            tail = temp;
        }
        length++;
    }
    
    public static void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow....");
            return;
        }
        if(head == tail)
        {
            head = tail = null;
        }
        else
        {
            LLnode current = head;
            while(current.next != tail)
            {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        length--;
    }
   
    public static int peek()
    {
        int result = isEmpty() ? -1 : tail.data;
        return result;
    }
    public static void main(String args[]) 
    {
        LLStackImplementation obj = new LLStackImplementation();
        push(1);
        push(2);
        push(3);
        push(4);
        display();
        System.out.println("peek value : " + peek());
        pop();
        pop();
        display();
        push(5);
        display();
        System.out.println("peek value : " + peek());
    }
}

/*
Output :
1 2 3 4 
peek value : 4
1 2 
1 2 5 
peek value : 5
*/