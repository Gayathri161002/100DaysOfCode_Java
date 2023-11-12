import java.util.*;
public class DiagonalSumProgram
{
    public static int diagonalSum(int n,int[][] A)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
              if(i==j)
              {
                  sum=sum+A[i][j];
              }
              
              if((i+j)==(n-1))
              {
                  sum=sum+A[i][j];
              }
          }
        }
        
        return sum;
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
      
      int sum=diagonalSum(n,A);
      
      System.out.println("Diagonal sum : " + sum);
    }
}