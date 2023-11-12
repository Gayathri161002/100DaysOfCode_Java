import java.util.*;
public class SearchValueIndex
{
    public static void findIndex(int n,int[][] A,int m)
    {
        int row=-1;
        int col=-1;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
              if(A[i][j]==m)
              {
                  row=i;
                  col=j;
              }
          }
        }
        
        if(row>=0 && col>=0)
        {
            System.out.println("row : " + row + " \n" + "column : " + col);
        }
        
        else
        {
            System.out.println("Not Found");
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
      int m=s.nextInt();
      
      findIndex(n,A,m);
    }
}