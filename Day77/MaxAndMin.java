import java.util.*;
class MaxAndMin
{
    static void maxAndMin(int[] arr,int size)
    {
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<size;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
            
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        
        System.out.println("maximum : " + max + "\nMinimum : " + min);
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
        maxAndMin(arr,size);
    }
}