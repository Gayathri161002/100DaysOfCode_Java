public class RecursionSelectionSort
{
    static void selectionSort(int[] A,int end,int start,int max)
    {
        if(end == 0)
        {
            return;
        }
        if(start < end)
        {
            if(A[start] > A[max])
            {
                selectionSort(A,end,start+1,start);  // start is max now
            }
            else
            {
                selectionSort(A,end,start+1,max);
            }
        }
        else
        {
            int temp = A[max];
            A[max] = A[end-1];
            A[end-1] = temp;
            selectionSort(A,end-1,0,0);
        }
    }
    public static void main(String args[]) 
    {
        int[] A = {1,4,3,5,2};
        selectionSort(A,A.length,0,0);
        for(int i : A)
        {
            System.out.print(i + " ");
        }
    }
}
