public class LinearSearch 
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
    }
    
    static int search(int[] A,int key)
    {
        int index = -1;
        for(int i=0;i<A.length;i++)
        {
            if(A[i] == key)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }

    public static void main(String args[]) 
    {
      int[] A = {2,1,10,8,6,4,3};
      PrintArray(A);
      int key = 10;
      System.out.println("\nindex : " + search(A,key));
    }
}

/*
Output :
2 1 10 8 6 4 3 
index : 2

*/