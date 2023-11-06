import java.util.*;
public class MinMaxArray
{
    public static int minimum(int size,int[] A)
    {
        int min=A[0];
        for(int i=0;i<size;i++)
        {
            if(A[i]<min)
            {
                min=A[i];
            }
        }
        
        return min;
        
    }
    
    public static int maximum(int size,int[] A)
    {
        int max=A[0];
        for(int i=0;i<size;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        
        return max;
        
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
      int min=minimum(size,A);
      int max=maximum(size,A);
      System.out.println("MINIMUM : " + min + " MAXIMUM : " + max);
    }
}