import java.util.*;
class SumOfElements
{
    static int sumOfElements(int[] arr,int size)
    {
        int sum = 0;
        for(int i : arr)
        {
            sum += i;
        }
        
        return sum;
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
        System.out.println(sumOfElements(arr,size));
    }
}