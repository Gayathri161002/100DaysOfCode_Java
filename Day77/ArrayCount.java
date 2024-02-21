import java.util.*;
class ArrayCount
{
    static int countElements(int[] arr,int size)
    {
        int count = 0;
        for(int i : arr)
        {
            count++;
        }
        
        return count;
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter array size : ");
        int size = s.nextInt();
        s.nextLine();
        int[] arr = new int[size];
        System.out.println("enter array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println(countElements(arr,size));
    }
}