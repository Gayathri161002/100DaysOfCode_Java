import java.util.*;
public class RemoveMid
{
    public static void removeMid(Stack<Integer> stk)
    {
        int[] A=new int[stk.size()-1];
        int mid=(stk.size())/2;
        
        for(int i=0;i<mid;i++)
        {
            A[i]=stk.pop();
        }
        stk.pop();
        
        for(int i=mid;i<A.length;i++)
        {
            A[i]=stk.pop();
        }
        
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        
    }
	public static void main(String[] args) 
	{
		Stack<Integer> stk = new Stack<>();
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		    stk.push(i);
		}
		
		removeMid(stk);
	
	}
}

