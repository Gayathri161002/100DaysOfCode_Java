public class LLQueueImplementation
{
    public static LLnode front;
    public static LLnode rear;
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
        LLnode current = front;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void enqueue(int data)
    {
        LLnode temp = new LLnode(data);
        if(rear==null)
        {
            front = temp;
            rear = temp;
        }
        else
        {
            rear.next = temp;
            rear = temp;
        }
        length++;
    }
    
    public static void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty....");
            return;
        }
        if(front == rear)
        {
            front = rear = null;
        }
        else
        {
            front = front.next;
        }
        length--;
    }
   
    public static void main(String args[]) 
    {
        LLQueueImplementation obj = new LLQueueImplementation();
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        display();
        dequeue();
        dequeue();
        display();
        enqueue(5);
        display();
        
    }
}

/*
Output :
1 2 3 4 
3 4 
3 4 5 
*/