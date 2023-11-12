import java.util.*;
public class StarTriangle
{
    public static void pattern(int n)
    { 
        
        for(int i=n;i>0;i--)
        {
          int s=i-1;
          int k=(n-s)*2-1;
          while(s!=0)
          {
              System.out.print("  ");
              s--;
          }
          while(k!=0)
          {
              System.out.print("* ");
              k--;
          }
          System.out.println();
        }
    }
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      pattern(n);
    }
}