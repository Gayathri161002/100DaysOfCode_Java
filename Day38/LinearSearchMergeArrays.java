public class LinearSearchMergeArrays
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static void mergeArrays(int[] A,int[] B)
    {
        int lenA = A.length;
        int lenB = B.length;
        int[] mArr = new int[lenA+lenB];
        int k = 0;
        
        for(int i=0;i<lenA;i++)
        {
            mArr[k++] = A[i];
        }
            
        for(int i=0;i<lenB;i++)
        {
            mArr[k++] = B[i];
        }
        PrintArray(mArr);
    }
    public static void main(String args[]) 
    {
      int[] A = {1,2,3};
      int[] B = {4,5,6};
      PrintArray(A);
      PrintArray(B);
      mergeArrays(A,B);
    }
}

/*
Output :
1 2 3 
2 3 1 
true

*/