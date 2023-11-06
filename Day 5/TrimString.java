import java.io.*;
import java.util.*;

public class TrimString
{

    public static void main(String[] args)
    {
        String str  = "   Welcome     To     Java      Programming     ";
        char[] A = str.toCharArray();
        int end=0;
        int start=0;
        for(int i=A.length-1;i>=0;i--)
        {
            if(A[i]!=' ')
            {
                end=i;
                break;
            }
        }
        
        for(int i=0;i<end;i++)
        {
            if(A[i]!=' ')
            {
                start=i;
                break;
            }
        }
        int len=end-start+1;
        String trimstr= new String(A,start,len);
        System.out.print(trimstr);
    }
}