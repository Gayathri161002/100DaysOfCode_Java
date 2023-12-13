import java.util.*;
public class GraphArticulation
{
    public static void dfs(int node ,int parent ,List<Integer>[] adjList ,int[] visit ,int[] disc ,int[] low ,int[] mark)
    {
        visit[node] = 1;
        int time = 0;
        disc[node] = low[node] = time;
        time++;
        int child = 0;
        
        for(int i : adjList[node])
        {
            if(i==parent)
                continue;
                
            if(visit[i]==0)
            {
                dfs(i,-1,adjList,visit,disc,low,mark);
                low[node] = Math.min(low[node],low[i]);
                
                if (low[i] == disc[node] && parent != -1) 
                {
                    mark[node] = 1;
                }
                
                child++;
            }
            else
            {
                low[node] = Math.min(low[node],disc[i]);
            }
        }
        
        if (child > 1 && parent == -1) 
        {
            mark[node] = 1;
        }
        
    }
    
    public static void articulationPoint(List<Integer>[] adjList,int n)
    {
        int[] visit = new int[n];
        int[] disc = new int[n];
        int[] low = new int[n];
        int[] mark = new int[n];
        List<Integer> result = new LinkedList<>();
        
        for(int i=0;i<n;i++)
        {
            if(visit[i]==0)
            {
                dfs(i,-1,adjList,visit,disc,low,mark);
            }
        }
        
        for (int i = 0; i < n; i++) 
        {
            if (mark[i] == 1) 
            {
                result.add(i);
            }
        }

        if (result.isEmpty()) 
        {
            result.add(-1);
        }

        System.out.print(result);
    }
    
    public static void main(String args[]) 
    {
      int n = 5;
      List<Integer>[] adjList = new LinkedList[n];
      for(int i=0;i<n;i++)
      {
          adjList[i] = new LinkedList<>();
      }
      
        adjList[0].add(1);
        adjList[1].add(0);
        adjList[1].add(2);
        adjList[2].add(1);
        adjList[2].add(0);
        adjList[0].add(2);
        adjList[1].add(3);
        adjList[3].add(1);
        adjList[3].add(4);
        adjList[4].add(3);
      
      articulationPoint(adjList,n);
    }
}