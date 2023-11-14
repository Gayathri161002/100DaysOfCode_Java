import java.util.*;
public class HallowRhombus
{
    public static void patternPrint(int n)
    {
        for(int i=0;i<n;i++)
        {
            int s=n-i-1;
            while(s>0)
            {
                System.out.print("  ");
                s--;
            }
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==0 || j==n-1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
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
