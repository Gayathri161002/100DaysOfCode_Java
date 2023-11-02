import java.util.*;
public class ReverseArray
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int[] A=new int[size];
	    for(int i=0;i<size;i++)
	    {
	        A[i]=s.nextInt();
	    }
	    
	    for(int i=0;i<size;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            if(A[i]>A[j])
	            {
	                int temp=A[i];
	                A[i]=A[j];
	                A[j]=temp;
	            }
	        }
	    }
	    
	    for(int i=0;i<size;i++)
	    {
	        System.out.print(A[i]+ " ");
	    }
	}
}
