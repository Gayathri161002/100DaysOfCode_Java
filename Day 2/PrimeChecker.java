import java.util.*;
public class PrimeChecker
{
    public static int isPrime(int n)
    {
        int flag=0;
        for(int i=2;i<n;i++)
	    {
	        if(n%i==0)
	        {
	            flag++;
	            break;
	        }
	    }
	    return flag;
    }
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int result=isPrime(n);
	    if(result==0)
	    {
	        System.out.println("PRIME");
	    }
	    else
	    {
	        System.out.println("Not Prime");
	    }
		
	}
}
