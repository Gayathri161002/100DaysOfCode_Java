import java.util.*;
public class GraphTarjanAlg
{
    public static void dfs(int node ,int parent ,List<Integer>[] adjList ,int[] visit ,int[] disc ,int[] low ,List<List<Integer>>result)
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
                dfs(i,-1,adjList,visit,disc,low,result);
                low[node] = Math.min(low[node],low[i]);
                
                if(low[i] <= disc[node])
                {
                    result.add(Arrays.asList(node,i));
                }
                
                child++;
            }
            else
            {
                low[node] = Math.min(low[node],disc[i]);
            }
        }
        
    }
    
    public static void tarjan(List<Integer>[] adjList,int n)
    {
        int[] visit = new int[n];
        int[] disc = new int[n];
        int[] low = new int[n];
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(visit[i]==0)
            {
                dfs(i,-1,adjList,visit,disc,low,result);
            }
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
      adjList[0].add(2);
      adjList[2].add(0);
      adjList[2].add(3);
      adjList[3].add(4);
      adjList[4].add(3);
      
      tarjan(adjList,n);
    }
}