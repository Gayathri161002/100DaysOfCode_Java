import java.util.*;
public class RemoveDupilcate
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
    public static void duplicateElement(int size,int[] A)
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
        
        for(int i=0;i<size;i++)
        {
            int k=A[i];
            if(B[k]!=0)
            {
                System.out.print(k + " ");
                B[k]=0;
            }
        }
        
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
      duplicateElement(size,A);
      
    }
}