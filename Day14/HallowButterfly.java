import java.util.*;
public class HallowButterfly
{
    public static void printPattern(int n)
    {
        for(int i=0;i<n*2-1;i++)
        {
            for(int j=0;j<n*2-1;j++)
            {
               if(i==j || (i+j)==(n*2-2) || j==0 || j==n*2-2)
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
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