import java.util.*;
public class RearrangeArray
{
    static void rearrangeArray(int[] A,int n)
    { 
        int[] B = new int[n];
       
        for(int i=0;i<n;i++)
        {
            B[i] = A[A[i]];
        }
       
        for(int i : B)
        {
            System.out.print(i + " ");
        }
    }   
    
    public static void main(String[] args) 
    {
        int n = 5;
        int[] A = {4,0,2,1,3};
        
        rearrangeArray(A,n);
    }
}