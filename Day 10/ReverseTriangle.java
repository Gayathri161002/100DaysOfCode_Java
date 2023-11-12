import java.util.*;
public class ReverseTriangle
{
    public static void pattern(int n)
    { 
        int k=n;
        for(int i=n;i>0;i--)
        {
          for(int j=0;j<i;j++)
          {
              System.out.print(k +" ");
          }
          k--;
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