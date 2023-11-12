import java.util.*;
public class DiagonalDifference
{
    public static int diagonalDiff(int n,int[][] A)
    {
        int lsum=0;
        int rsum=0;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
              if(i==j)
              {
                  lsum=lsum+A[i][j];
              }
              
              if((i+j)==(n-1))
              {
                  rsum=rsum+A[i][j];
              }
          }
        }
        int diff=Math.abs(lsum-rsum);
        return diff;
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
      
      int val=diagonalDiff(n,A);
      
      System.out.println("Diagonal difference : " + val);
    }
}