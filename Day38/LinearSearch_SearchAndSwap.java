public class LinearSearch_SearchAndSwap
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static void SearchAndSwap(int[] A,int val)
    {
        for(int i=0;i<A.length;i++)
        {
            if(A[i] == val)
            {
                int t = A[i];
                A[i] = A[i+1];
                A[i+1] = t;
                break;
            }
        }
    }
    public static void main(String args[]) 
    {
      int[] A = {2,1,10,8,6,4,5};
      PrintArray(A);
      SearchAndSwap(A,8);
      PrintArray(A);
    }
}

/*
Output :
2 1 10 8 6 4 5 
2 1 10 6 8 4 5 

*/