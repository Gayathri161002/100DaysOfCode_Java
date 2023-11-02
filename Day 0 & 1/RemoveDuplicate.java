import java.util.*;
public class RemoveDuplicate
{
    public static int maximum(int size,int A[])
    {
        int max=A[0];
        for(int i=1;i<size;i++)
	    {
	        if(A[i]>max)
	        {
	            max=A[i];
	        }
	    }
	    
	    return max;
    }
    public static void removeDuplicate(int size,int A[])
    {
        int max=maximum(size,A);
        int[] B=new int[max+1];
        for(int i=0;i<max+1;i++)
	    {
	        B[i]=0;
	    }
	    
	    for(int i=0;i<size;i++)
	    {
	        int k=A[i];
	        B[k]++;
	    }
	    
	    for(int i=0;i<max+1;i++)
	    {
	        if(B[i]!=0)
	        {
	            System.out.print(i+" ");
	            B[i]=0;
	        }
	    }
    }
    
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int[] A=new int[size];
	    for(int i=0;i<size;i++)
	    {
	        A[i]=s.nextInt();
	    }
	    
	    removeDuplicate(size,A);
	}
}
