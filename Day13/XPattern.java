import java.util.*;
public class XPattern
{
    public static void patternPrint(int n)
    {
        int x=0;
        int y=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==x)
                {
                    System.out.print("*");
                }
                else if(j==y)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            x++;
            y--;
        }
    }
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      patternPrint(n);
    }
}
