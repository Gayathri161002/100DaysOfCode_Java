import java.util.*;
public class MaxMinArray
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
	    int max=A[0];
	    int min=A[0];
	    
	    for(int i=1;i<size;i++)
	    {
	        if(A[i]>max)
	        {
	            max=A[i];
	        }
	    }
	    
	    for(int i=1;i<size;i++)
	    {
	        if(A[i]<min)
	        {
	            min=A[i];
	        }
	    }
	    
	    System.out.println("max :" + max);
	    System.out.println("min :" + min);
        
	}
}
