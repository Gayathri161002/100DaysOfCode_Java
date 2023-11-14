import java.util.*;
public class ArrowPattern
{
    public static void patternPrint(int n)
    {
        for(int i=0;i<n;i++)
        {
            int s=i;
            while(s>0)
            {
                System.out.print(" ");
                s--;
            }
            for(int j=i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--)
        {
            int s=i;
            while(s>0)
            {
                System.out.print(" ");
                s--;
            }
            for(int j=i;j>=0;j--)
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
      patternPrint(n);
    }
}
