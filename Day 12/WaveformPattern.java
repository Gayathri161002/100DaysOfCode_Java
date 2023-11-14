import java.util.*;
public class WaveformPattern
{
    public static void patternPrint(int n,int[][] A)
    {
        int d=0;
        for(int i=0;i<n;i++)
        {
            if(d==0)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(A[j][i] + " ");
                }
                d=1;
            }
            else
            {
                for(int j=n-1;j>=0;j--)
                {
                    System.out.print(A[j][i] + " ");
                }
                d=0;
            }
        }
    }
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[][] A=new int[n][n];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
              A[i][j]=s.nextInt();
          }
      }
      patternPrint(n,A);
    }
}
