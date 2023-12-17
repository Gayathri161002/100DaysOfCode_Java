import java.util.Arrays;
public class LinearSearch_IsArrayEqual
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static boolean isArrayEqual(int[] A,int[] B)
    {
        int lenA = A.length;
        int lenB = B.length;
        boolean[] boolA = new boolean[lenA];
        Arrays.fill(boolA,false);
        boolean[] boolB = new boolean[lenB];
        Arrays.fill(boolB,false);
        if(lenA != lenB)
        {
            return false;
        }
        
        for(int i=0;i<lenA;i++)
        {
            for(int j=0;j<lenB;j++)
            {
                if(A[i] == B[j])
                {
                    boolA[i] = true;
                    boolB[j] = true;
                    break;
                }
            }
        }
            
        for (int i = 0; i < lenA; i++) 
        {
            if (!boolA[i] || !boolB[i]) 
            {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String args[]) 
    {
      int[] A = {1,2,3};
      int[] B = {2,3,1};
      PrintArray(A);
      PrintArray(B);
      System.out.print(isArrayEqual(A,B));
    }
}

/*
Output :
1 2 3 
2 3 1 
true

*/