import java.util.*;
public class ColunmMaximum
{
    public static void colMax(int n,int[][] A)
    {
        for(int i=0;i<n;i++)
        {
            int max=A[0][i];
            for(int j=0;j<n;j++)
            {
                if(max<A[j][i])
                {
                    max=A[j][i];
                }
            }
            System.out.println(max);
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
      colMax(n,A);
    }
}
