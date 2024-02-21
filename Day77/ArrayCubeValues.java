import java.util.*;
class ArrayCubeValues
{
    static void cubeValues(int[] arr,int size)
    {
        for(int i : arr)
        {
            System.out.println(i + " cube : " + i*i*i);
        }
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
        cubeValues(arr,size);
    }
}