import java.util.*;
public class SumOfArray
{
    public static int sum(int size,int[] A)
    {
        int sum=0;
        for(int i=0;i<size;i++)
        {
            if(A[i]>0)
            {
                sum+=A[i];
            }
        }
        
        return sum;
        
    }
    
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int[] A=new int[size];
      for(int i=0;i<size;i++)
      {
          A[i]=s.nextInt();
      }
      int result=sum(size,A);
      
      System.out.println("Sum : " + result);
    }
}