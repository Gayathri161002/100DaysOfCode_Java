import java.util.*;
public class PrimeGenerator
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
    
    public static void primeGenerate(int n,int m)
    {
        for(int i=n;i<m;i++)
        {
            int result=isPrime(i);
            if(result==0)
            {
                     System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) 
    {	  
                Scanner s=new Scanner(System.in);
                int n=s.nextInt();
                int m=s.nextInt();
                primeGenerate(n,m);
    }
}
