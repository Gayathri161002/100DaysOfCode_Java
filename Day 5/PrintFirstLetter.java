import java.io.*;
import java.util.*;

public class PrintFirstLetter
{

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        String str  = s.nextLine();
        char[] A = str.toCharArray();

        for(int i=1;i<A.length;i++)
        {
            if((A[i]!=' ') && ((i==0) || (A[i-1]==' ')))
            {
                System.out.println(A[i]);
            }
        }
    }
}