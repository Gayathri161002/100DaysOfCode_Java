import java.util.*;
public class RoundRobinScheduler
{
    public static void rrScheduler(int[] process,int[] bt,int quantum)
    {
        int n=process.length;
        Queue<Integer> q=new LinkedList<>(); 
        int[] remaining_time = new int[n];
        
        for(int i=0;i<n;i++)
        {
            remaining_time[i]=bt[i];
            q.offer(i);
        }
        
        while(!q.isEmpty())
        {
            int p = q.poll();
            
            if(remaining_time[p] <= quantum)
            {
                System.out.println("Process " + p + " completed in " + remaining_time[p] + " units" );
                remaining_time[p] =0;
            }
            else
            {
                System.out.println("Process " + p + " executed for " + remaining_time[p] + " units" );
                remaining_time[p]-=quantum;
            }
            
            if(remaining_time[p] >0)
            {
                q.offer(p);
            }
        }
        
    }
	public static void main(String[] args) 
	{
	    int[] process = {0,1,2,3,4};
		int[] bt = {10,11,2,7,5};
		int quantum=3;
		rrScheduler(process,bt,quantum);
		
	}
}
