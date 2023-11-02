import java.util.*;
public class ArmstrongNumber
    public static int numCount(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        
        return count;
    }
    
    public static int power(int y,int k)
    {
        int r=1;
        for(int i=1;i<=k;i++)
        {
            r=r*y;
        }
        
        return r;
    }
    
    public static int isArmstrong(int n)
    {
        int k=numCount(n);
        int sum=0;
        while(n!=0)
        {
            int y=n%10;
            int p=power(y,k);
            sum=sum+p;
            n=n/10;
        }
        
        return sum;
    }
    public static void main(String[] args)
    {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int result=isArmstrong(n);
         if(result==n)
        {
               System.out.println("Armstrong number");	
        }
        else
        {
               System.out.println("Not a Armstrong number");
        }
    }

}
