import java.util.*;
public class FCFS
{
    public static void fcfs(String[] p,int[] bt,int[] wt)
    {
        Queue<Integer> q=new LinkedList<>(); 
        int t=0;
        int total_tat=0;
        System.out.println("Process " + "Burst_time  " + "waiting_time  " + "Turn_around_time  " + "Completion_time");
        
        for(int i=0;i<p.length;i++)
        {
            System.out.print(p[i]+"\t      ");
            System.out.print(bt[i]+"\t         ");
            System.out.print(wt[i]+"\t       ");
            q.offer(bt[i]);
            t+=q.peek();
            total_tat+=(wt[i]+q.peek());
            System.out.print((wt[i]+q.peek())+"\t           ");
            System.out.print(t+"\t       ");
            q.poll();
            System.out.println();
        }
        
        int total_Wt=0;
        for(int i : wt)
        {
            total_Wt+=i;
        }
        
        System.out.println("\nAverage Waiting time : " + ((float)total_Wt/(float)wt.length));
        System.out.println("\nAverage Turn Around time : " + ((float)total_tat/(float)p.length));
    }
	public static void main(String[] args) 
	{
	    String[] p={"P1","P2","P3","P4","P5"};
		int[] bt ={4,3,1,2,5};
		int[] wt ={0,3,5,5,6};
		fcfs(p,bt,wt);
	}
}
