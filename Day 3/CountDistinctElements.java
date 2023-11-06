import java.util.*;
public class CountDistinctElements
{
    public static int maximum(int size,int[] A)
    {
        int max=A[0];
        for(int i=1;i<size;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        return max;
    }
    public static int distinctElement(int size,int[] A)
    {
        int max=maximum(size,A);
        int[] B=new int[max+1];
        for(int i=0;i<max+1;i++)
        {
            B[i]=0;
        }
        
        for(int i=0;i<size;i++)
        {
            int k=A[i];
            B[k]++;
        }
        
        int count=0;
        for(int i=0;i<max+1;i++)
        {
            if(B[i]==1)
            {
                count++;
            }
        }
        
        return count;
        
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
      int result=distinctElement(size,A);
      
      System.out.println("Distinct Elements : " + result);
    }
}