import java.util.*;
public class Palindrome
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int rev=0;
	    int rem;
	    int k=n;
	    while(k!=0)
                      {
                            rem=k%10;
                            rev=rev*10 + rem;
                            k=k/10;
                      }
        
                      if(n==rev)
                      {
                            System.out.println("PALINDROME");
                      }
                      else
                      {
                            System.out.println("NOT A PALINDROME");
                      }
        
	}
}
