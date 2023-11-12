import java.util.*;
public class NumberTriangle
{
    public static void pattern(int n)
    { 
        int a=1;
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
              System.out.print(a+" ");
              k--;
          }
          System.out.println();
          a++;
        }
    }
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      pattern(n);
    }
}