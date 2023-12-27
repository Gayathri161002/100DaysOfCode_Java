public class RecursionBinarySearch
{
    static int binarySearch(int[] A,int target,int start, int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            
            if(A[mid] == target)
            {
                return mid;
            }
            else if(A[mid] < target)
            {
                return binarySearch(A,target,mid+1,end);
            }
            else
            {
                return binarySearch(A,target,start,mid-1);
            }
        }
        
        return -1;
    }
    public static void main(String args[]) 
    {
        int[] A = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(binarySearch(A,target,0,A.length-1));
    }
}