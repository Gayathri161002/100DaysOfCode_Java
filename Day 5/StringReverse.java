import java.util.*;

public class StringReverse
{

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] A = str.toCharArray();
        
        int i=0;
        int j=A.length-1;
        
        while(i<j)
        {
            char temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
        System.out.print(A);
    }
}