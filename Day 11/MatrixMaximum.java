import java.util.*;
public class MatrixMaximum
{
    public static int maximum(int n,int[][] A)
    {
        int max=A[0][0];
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
              if(max<A[i][j])
              {
                  max=A[i][j];
              }
          }
        }
        
        return max;
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
      int max=maximum(n,A);
      System.out.print("Maximum value : " + max);
    }
}