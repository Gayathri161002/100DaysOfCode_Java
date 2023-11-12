import java.util.*;
public class MatrixTranspose
{
    public static void matrixTranspose(int n,int[][] A)
    {
        int[][] B=new int[n][n];
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
              B[j][i]=A[i][j];
          }
        }
        
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
              System.out.print(B[i][j] + " ");
          }
          System.out.println();
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
      matrixTranspose(n,A);
    }
}