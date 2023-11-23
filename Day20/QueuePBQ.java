import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class QueuePBQ
{
    public static void main(String[] args) 
    {
        Queue<Integer> queue = new PriorityBlockingQueue<>();
        
        for(int i=1;i<=10;i++)
        {
            queue.add(i);
        }
        
        System.out.println("Queue Elements are...\n" + queue);
        System.out.println("Peek value : " +queue.peek());
        System.out.println("Dequeue the peek element : " + queue.remove());
        System.out.println("Peek value after Dequeue : " +queue.peek());
        System.out.println("Queue Elements are...\n" + queue);
    }
}

/*
Queue Elements are...
[1, 2, 3, 4, 5]
Peek value : 1
Dequeue the peek element : 1
Peek value after Dequeue : 2
Queue Elements are...
[2, 4, 3, 5]

*/