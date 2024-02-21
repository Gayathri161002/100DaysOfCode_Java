import java.util.*;
class CopyArray
{
    static int[] copyArray(int[] arr,int size)
    {
        int[] B = new int[size];
        
        for(int i=0;i<size;i++)
        {
            B[i] = arr[i];
        }
        
        return B;
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
        int[] temp = copyArray(arr,size);
        
        for(int i : temp)
        {
            System.out.print(i + " ");
        }
    }
}