import java.util.Scanner;
public class SwatikaPattern 
{
    public static void patternPrint(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==(n/2) || i==(n/2) || (i==0 && j<=(n/2)) || (i==n-1 && j>(n/2)) ||  (i<=(n/2) && j==n-1) || (i>(n/2) && j==0))
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