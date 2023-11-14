import java.util.*;
public class LeftArrowPattern
{
    public static void patternPrint(int n)
    {
        for(int i=n-1;i>=0;i--)
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
        for(int i=1;i<n;i++)
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
