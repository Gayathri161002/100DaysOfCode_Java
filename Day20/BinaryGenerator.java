import java.util.*;
public class BinaryGenerator
{
    public static void binaryGenerator(int n)
    {
        String[] result = new String[n];
        Queue<String> q=new LinkedList<>(); 
        q.offer("1");
        
        for(int i=0;i<n;i++)
        {
            result[i]=q.poll();
            String r1=result[i] + "0";
            String r2=result[i] + "1";
            q.offer(r1);
            q.offer(r2);
        }
        
        System.out.println(Arrays.toString(result));
    }
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		binaryGenerator(n);
	}
}

/*
Input :
10
Output :
[1, 10, 11, 100, 101, 110, 111, 1000, 1001, 1010]

*/