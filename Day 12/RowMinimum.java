import java.util.*;
public class RowMinimum
{
    public static void rowMin(int n,int[][] A)
    {
        for(int i=0;i<n;i++)
        {
            int min=A[i][0];
            for(int j=0;j<n;j++)
            {
                if(min>A[i][j])
                {
                    min=A[i][j];
                }
            }
            System.out.println(min);
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
      rowMin(n,A);
    }
}
