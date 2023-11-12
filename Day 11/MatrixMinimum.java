import java.util.*;
public class MatrixMinimum
{
    public static int minimum(int n,int[][] A)
    {
        int min=A[0][0];
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
              if(min>A[i][j])
              {
                  min=A[i][j];
              }
          }
        }
        
        return min;
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
      int min=minimum(n,A);
      System.out.print("Minimum value : " + min);
    }
}