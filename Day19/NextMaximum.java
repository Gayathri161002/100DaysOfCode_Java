import java.util.*;
public class NextMaximum
{
    public static int[] nextMax(int n,int[] A)
    {
        Stack<Integer> stk = new Stack<>();
        int[] result= new int[n]; 
        stk.push(0);
        for(int i=1;i<n;i++)
        {
            while((!stk.isEmpty()) && (A[i] > A[stk.peek()]))
            {
                int index=stk.pop();
                result[index]=A[i];
            }
            
            stk.push(i);   
        }
        
        while(!stk.isEmpty())
        {
            result[stk.pop()]=-1;
        }
        
        return result;
    }
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++)
		{
		    A[i]=s.nextInt();
		}
		
		int[] result=nextMax(n,A);
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(result[i] + " ");
		}
	}
}

/*

Input 1 :
7
1 2 3 23 2 25 27

Output 1 :
2 3 23 25 25 27 -1

Input 2 :
5
1 2 3 4 1

Output 2 :
2 3 4 -1 -1
*/