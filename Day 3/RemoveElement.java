import java.util.*;

public class RemoveElement
{
    public static void removeElement(int size, int[] A, int r) 
    {
        for (int i = 0; i < size; i++) 
        {
            if (A[i] == r) 
            {
                for (int j = i; j < size-1; j++) 
                {
                    A[j] = A[j + 1];
                }
            }
        }
        for (int i = 0; i < size - 1; i++) 
        {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] A = new int[size];
        for (int i = 0; i < size; i++)
        {
            A[i] = s.nextInt();
        }
        int r = s.nextInt();

        removeElement(size, A, r);
    }
}
