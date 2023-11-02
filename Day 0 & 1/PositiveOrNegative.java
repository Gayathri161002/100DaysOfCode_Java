import java.util.*;
public class PositiveOrNegative
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int num=s.nextInt();
	    if(num>0)
	    {
	        System.out.println("POSITIVE NUMBER");
	    }
	    else if(num<0)
	    {
	        System.out.println("NEGATIVE NUMBER");
	    }
	    else if(num==0)
	    {
	        System.out.println("ZERO");
	    }
	  }

}
