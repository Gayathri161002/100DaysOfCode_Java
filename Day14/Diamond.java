import java.util.*;
public class Diamond
{
    public static void printPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            int s=n-i-1;
            while(s>0)
            {
                System.out.print(" ");
                s--;
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--)
        {
            int s=n-i-1;
            while(s>0)
            {
                System.out.print(" ");
                s--;
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      printPattern(n);
    }
}