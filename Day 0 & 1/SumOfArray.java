import java.util.*;

public class SumOfArray
{
            public static void main(String[] args)
            {
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int[] Array=new int[size];
	    for(int i=0;i<size;i++)
	    {
	        Array[i]=s.nextInt();
	    }
	    
	    int sum=0;
		
                 	    for(int i=0;i<size;i++)
	    {
	        sum=sum+Array[i];
	    }
		
                      System.out.println(sum);
             }
}
