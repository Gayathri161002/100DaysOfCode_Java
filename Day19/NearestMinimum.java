import java.util.*;
public class NearestMinimum
{
    public static int[] nearestMin(int n,int[] A)
    {
        Stack<Integer> stk = new Stack<>();
        int[] result= new int[n];
        for(int i=0;i<n;i++)
        {
            while(!stk.isEmpty() && A[i] < stk.peek())
            {
                result[i]=A[i];
                stk.pop();
            }
           
            if(stk.isEmpty())
            {
                result[i]=-1;
                stk.push(A[i]);
            }
           
            else if(A[i] > stk.peek())
            {
                result[i]=stk.peek();
                stk.push(A[i]);
            }
        }
       
        return result;
    }
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] A = new int[n];
for(int i=0;i<n;i++)
{
   A[i]=s.nextInt();
}

int[] result=nearestMin(n,A);

for(int i=0;i<n;i++)
{
   System.out.print(result[i] + " ");
}
}
}

/*
Input :
6 
1 2 4 10 3 5

Output :
-1 1 2 4 2 3

*/