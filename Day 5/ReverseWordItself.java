import java.util.*;

public class ReverseWordItself
{

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] A = str.toCharArray();
        
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            
            if(A[i]!=' ')
            {
                count++;
            }
            else
            {
                for(int j=i-1;j>=i-count;j--)
                {
                    System.out.print(A[j]);
                }
                count=0;
                System.out.print(" ");
            }
        }
        int len=A.length;
        for(int i=len-1;i>=len-count;i--)
        {
            System.out.print(A[i]);
        }
    }
}