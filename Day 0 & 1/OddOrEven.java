import java.util.*;
public class OddOrEven
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int num1=s.nextInt();
	    if((num1&1)==0)
	    {
	        System.out.println("EVEN");
	    }
	    else
	    {
	        System.out.println("ODD");
	    }
	    
	}

}
