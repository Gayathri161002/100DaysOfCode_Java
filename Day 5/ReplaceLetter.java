import java.io.*;
import java.util.*;

public class ReplaceLetter
{

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] A = str.toCharArray();
    
        for(int i=0;i<A.length;i++)
        {
            if(A[i]=='o')
            {
                A[i]='z';
            }
        }

        System.out.print(A);
    }
}