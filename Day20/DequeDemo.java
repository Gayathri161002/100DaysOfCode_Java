import java.util.*;

public class DequeDemo
{
	public static void main(String[] args) 
	{
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.addFirst(1);
		dq.addFirst(2);
		dq.addFirst(3);
		dq.addLast(4);
		dq.addLast(5);
		
		System.out.println("Queue elements are...\n" + dq);
		System.out.println("Peek value : " + dq.peek());
		
		dq.removeFirst();
		dq.removeLast();
		
		System.out.println("Queue elements are...\n" + dq);
	}
}
